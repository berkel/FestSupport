package org.fest.lang;

import com.intellij.javaee.ExternalResourceManager;
import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceProvider;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReference;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.URLReference;
import com.intellij.psi.util.CachedValue;
import com.intellij.psi.util.CachedValueProvider;
import com.intellij.psi.util.CachedValuesManager;
import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlTag;
import com.intellij.util.ArrayUtil;
import com.intellij.util.ProcessingContext;
import com.intellij.util.containers.ContainerUtil;
import org.fest.util.FestUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * User: Dmitry Shkinev
 * Date: 24.01.12
 * Time: 21:56
 */
public class FestReferenceProvider extends PsiReferenceProvider {

	private static final Key<CachedValue<PsiReference[]>> CACHED_FEST_REFS = Key.create("CACHED_FEST_REFS");

	@NotNull
	@Override
	public PsiReference[] getReferencesByElement(@NotNull PsiElement e, @NotNull ProcessingContext context) {
		final PsiElement element = e.getParent();
		if (element instanceof XmlAttribute) {
			final XmlAttribute attribute = (XmlAttribute) element;

			CachedValue<PsiReference[]> cachedValue = attribute.getUserData(CACHED_FEST_REFS);
			if (cachedValue == null) {
				cachedValue = CachedValuesManager.getManager(element.getProject()).createCachedValue(new ReferenceProvider(attribute), false);
				attribute.putUserData(CACHED_FEST_REFS, cachedValue);
			}

			final PsiReference[] value = cachedValue.getValue();
			assert value != null;
			return value;
		} else {
			return PsiReference.EMPTY_ARRAY;
		}
	}

	private class ReferenceProvider implements CachedValueProvider<PsiReference[]> {
		private final XmlAttribute myAttribute;

		ReferenceProvider(XmlAttribute attribute) {
			myAttribute = attribute;
		}

		public Result<PsiReference[]> compute() {
			final PsiReference[] referencesImpl = getReferencesImpl(myAttribute);
			final Object[] refs = new PsiElement[referencesImpl.length];
			for (int i = 0; i < refs.length; i++) {
				refs[i] = referencesImpl[i].getElement();
			}
			return new Result<PsiReference[]>(referencesImpl, ArrayUtil.append(refs, myAttribute.getValueElement()));
		}

		private PsiReference[] getReferencesImpl(final XmlAttribute attribute) {
			final PsiReference[] psiReferences;
			final XmlTag tag = attribute.getParent();

			if (FestUtil.isIncludeOrInsertHref(attribute)) {
				final String href = attribute.getValue();
				final String resourceLocation = ExternalResourceManager.getInstance().getResourceLocation(href, attribute.getProject());
				if (href == resourceLocation) {
					if (href.contains("://")) {
						psiReferences = new PsiReference[]{new URLReference(attribute)};
					} else {
						final FileReferenceSet filereferenceset = new FileReferenceSet(href, attribute.getValueElement(), 1, FestReferenceProvider.this, true);
						psiReferences = filereferenceset.getAllReferences();
//						for (final FileReference ref : filereferenceset.getAllReferences()) {
//							System.out.print(ref.getText());
//						}
					}
				} else {
					psiReferences = new PsiReference[]{new URLReference(attribute)};
				}
			} else {
				psiReferences = PsiReference.EMPTY_ARRAY;
			}

			return psiReferences;
		}
	}
}
