package org.fest.lang.validation.inspections;

import com.intellij.codeHighlighting.HighlightDisplayLevel;
import com.intellij.codeInspection.LocalInspectionTool;
import org.fest.util.FestBundle;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

/**
 * User: Dmitry Shkinev
 * Date: 06.03.12
 * Time: 23:05
 */
public abstract class FestInspection extends LocalInspectionTool {

	@Nls
	@NotNull
	public String getGroupDisplayName() {
		return FestBundle.message("options.fest.display.name");
	}

	@NotNull
	public HighlightDisplayLevel getDefaultLevel() {
		return HighlightDisplayLevel.ERROR;
	}

	public boolean isEnabledByDefault() {
		return true;
	}
}
