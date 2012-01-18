package org.fest.highlighter;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.pages.XMLColorsPage;
import org.fest.util.FestStrings;
import org.jetbrains.annotations.NotNull;

/**
 * User: Dmitry Shkinev
 * Date: 12.01.12
 * Time: 21:11
 */
public class FestColorsPage extends XMLColorsPage {

	private static final Logger LOG = Logger.getInstance(FestColorsPage.class.getName());

	private static final AttributesDescriptor[] ATTRS = new AttributesDescriptor[]{
			new AttributesDescriptor(FestStrings.message("options.fest.attribute.descriptor.tag"), FestHighlighterColors.XML_TAG),
			new AttributesDescriptor(FestStrings.message("options.fest.attribute.descriptor.tag.name"), FestHighlighterColors.XML_TAG_NAME),
	};

	@NotNull
	public AttributesDescriptor[] getAttributeDescriptors() {
		return ATTRS;
	}

	@NotNull
	public String getDisplayName() {
		return FestStrings.message("options.fest.display.name");
	}

	@NotNull
	public FestFileHighlighter getHighlighter() {
		return new FestFileHighlighter();
	}

	@NotNull
	public String getDemoText() {
		return "<?xml version=\"1.0\"?>\n" +
				"<fest:template xmlns:fest=\"http://fest.mail.ru\" context_name=\"json\">\n" +
				"    <input>\n" +
				"        <fest:attributes>\n" +
				"            <fest:if test=\"false\">\n" +
				"                <fest:attribute name=\"checked\">checked</fest:attribute>\n" +
				"            </fest:if>\n" +
				"        </fest:attributes>\n" +
				"    </input>\n" +
				"    <div>\n" +
				"        <fest:choose>\n" +
				"            <fest:when test=\"false\">foo</fest:when>\n" +
				"            <fest:otherwise>foo</fest:otherwise>\n" +
				"        </fest:choose>\n" +
				"        bar\n" +
				"    </div>\n" +
				"    <div>\n" +
				"        <fest:attributes>\n" +
				"            <fest:attribute name=\"class\">\n" +
				"                foo\n" +
				"                <fest:if test=\"true\">\n" +
				"                    <fest:text value=\" \"/>bar\n" +
				"                </fest:if>\n" +
				"            </fest:attribute>\n" +
				"        </fest:attributes>\n" +
				"    </div>\n" +
				"    <div>\n" +
				"        <fest:attributes>\n" +
				"            <fest:attribute name=\"class\">\n" +
				"                <fest:get name=\"class\"/>\n" +
				"            </fest:attribute>\n" +
				"        </fest:attributes>\n" +
				"    </div>\n" +
				"    <div>\n" +
				"        <fest:attributes>\n" +
				"            <fest:choose>\n" +
				"                <fest:when test=\"true\">\n" +
				"                    <fest:attribute name=\"when\">true</fest:attribute>\n" +
				"                </fest:when>\n" +
				"                <fest:otherwise>\n" +
				"                    <fest:attribute name=\"when\">false</fest:attribute>\n" +
				"                </fest:otherwise>\n" +
				"            </fest:choose>\n" +
				"            <fest:choose>\n" +
				"                <fest:when test=\"false\">\n" +
				"                    <fest:attribute name=\"otherwise\">false</fest:attribute>\n" +
				"                </fest:when>\n" +
				"                <fest:otherwise>\n" +
				"                    <fest:attribute name=\"otherwise\">true</fest:attribute>\n" +
				"                </fest:otherwise>\n" +
				"            </fest:choose>\n" +
				"        </fest:attributes>\n" +
				"    </div>\n" +
				"    <fest:set name=\"class\">foo</fest:set>\n" +
				"    <div>foo</div>\n" +
				"</fest:template>";
	}
}
