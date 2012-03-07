package org.fest.lang.validation.inspections;

import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.XmlElementVisitor;
import com.intellij.psi.xml.XmlTag;
import org.fest.util.FestUtil;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * User: Dmitry Shkinev
 * Date: 06.03.12
 * Time: 23:04
 */
public class FestNestedAttributesInspection extends FestInspection {

	@Nls
	@NotNull
	public String getDisplayName() {
		return "Fest nested attributes";
	}

	@NonNls
	@NotNull
	public String getShortName() {
		return "FestNestedAttributes";
	}

	@Override
	@NotNull
	public PsiElementVisitor buildVisitor(@NotNull final ProblemsHolder holder, boolean isOnTheFly) {
		return new MyVisitor(holder);
	}

	private static class MyVisitor extends XmlElementVisitor {

		private final ProblemsHolder myHolder;

		public MyVisitor(ProblemsHolder holder) {
			myHolder = holder;
		}

		@Override
		public void visitXmlTag(final XmlTag tag) {
			if (FestUtil.isFestTag(tag, "attributes")) {
				XmlTag parentTag = tag.getParentTag();
				while (parentTag != null) {
					if (FestUtil.isFestTag(parentTag, "attributes")) {
						myHolder.registerProblem(tag, "Nested attributes tag is not allowed");
					}
					parentTag = parentTag.getParentTag();
				}
			}
		}
	}
}
