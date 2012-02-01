package org.fest.lang;

import com.intellij.ide.fileTemplates.FileTemplateDescriptor;
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptor;
import com.intellij.ide.fileTemplates.FileTemplateGroupDescriptorFactory;
import com.intellij.openapi.fileTypes.StdFileTypes;

/**
 * User: Dmitry Shkinev
 * Date: 21.01.12
 * Time: 15:52
 */
public class FestFileTemplateGroupDescriptorFactory implements FileTemplateGroupDescriptorFactory {

	private static final String FEST_TEMPLATE_NAME = "Fest template";
	private static final String FEST_TEMPLATE_LOCATION = "/new_file_template.xml";

	public FileTemplateGroupDescriptor getFileTemplatesDescriptor() {
		final FileTemplateGroupDescriptor group = new FileTemplateGroupDescriptor("Fest", StdFileTypes.XML.getIcon());
		group.addTemplate(new FileTemplateDescriptor(FEST_TEMPLATE_LOCATION, StdFileTypes.XML.getIcon()));
		return group;
	}
}
