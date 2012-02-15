package org.fest.util;

import com.intellij.psi.xml.XmlAttribute;
import com.intellij.psi.xml.XmlTag;
import org.jetbrains.annotations.NotNull;

/**
 * User: Dmitry Shkinev
 * Date: 20.01.12
 * Time: 21:38
 */
public class FestUtil {

	public static final String FEST_NS = "http://fest.mail.ru";
	public static final String FEST_SCHEMA_LOCATION = "/resources/fest.xsd";
	public static final String PLUGIN_EXTENSIONS_NS = "urn:idea:fest-plugin#extensions";

	public static boolean isFestTag(@NotNull XmlTag tag) {
		final String s = tag.getNamespace();
		return FEST_NS.equals(s);
	}

	public static boolean isFestAttribute(@NotNull XmlAttribute attribute) {
		return isFestTag(attribute.getParent());
	}

	public static boolean isIncludeOrInsertHref(XmlAttribute xmlattribute) {
		if (xmlattribute == null || !isFestAttribute(xmlattribute))
            return false;
		final String localName = xmlattribute.getParent().getLocalName();
		return isIncludeOrInsert(localName) && "src".equals(xmlattribute.getName());
	}

	private static boolean isIncludeOrInsert(String localName) {
		return ("include".equals(localName) || "insert".equals(localName) || "script".equals(localName));
	}
}
