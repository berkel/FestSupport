package org.fest.lang;

import com.intellij.psi.PsiReferenceContributor;
import com.intellij.psi.PsiReferenceRegistrar;
import com.intellij.psi.xml.XmlAttributeValue;
import org.fest.util.FestUtil;

import static com.intellij.patterns.PlatformPatterns.psiElement;
import static com.intellij.patterns.StandardPatterns.string;
import static com.intellij.patterns.XmlPatterns.xmlAttribute;
import static com.intellij.patterns.XmlPatterns.xmlTag;

/**
 * User: Dmitry Shkinev
 * Date: 24.01.12
 * Time: 21:44
 */
public class FestReferenceContributor extends PsiReferenceContributor {

	@Override
	public void registerReferenceProviders(PsiReferenceRegistrar registrar) {
		registrar.registerReferenceProvider(psiElement(XmlAttributeValue.class).withParent(xmlAttribute().withLocalName(string().oneOf(
				"src"
		)).withParent(xmlTag().withNamespace(FestUtil.FEST_NS))), new FestReferenceProvider());
	}
}
