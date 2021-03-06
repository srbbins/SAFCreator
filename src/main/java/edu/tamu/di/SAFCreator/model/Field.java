package edu.tamu.di.SAFCreator.model;

import edu.tamu.di.SAFCreator.Util;

public class Field extends CellDatumImpl
{
	private SchematicFieldSet schema;
	private FieldLabel label;
	//private String element;
	//private String language;
	//private String qualifier=null;
	private String value;

	public SchematicFieldSet getSchema() {
		return schema;
	}
	public void setSchema(SchematicFieldSet schema) {
		this.schema = schema;
	}
	
	public void setLabel(FieldLabel label)
	{
		this.label = label;
	}
	
	public FieldLabel getLabel()
	{
		return label;
	}
//	public String getElement() {
//		return element;
//	}
//	public void setElement(String element) {
//		this.element = element;
//	}
//	public String getQualifier() {
//		return qualifier;
//	}
//	public void setQualifier(String qualifier) {
//		this.qualifier = qualifier;
//	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
//	public String getLanguage() {
//		return language;
//	}
//	public void setLanguage(String language) {
//		this.language = language;
//	}
	

	public String getXMLSnippet()
	{
		return "<dcvalue element=\""+label.getElement()+"\"" +
				(label.getQualifier()==null?"":" qualifier=\""+label.getQualifier()+"\"") + 
				(label.getLanguage()==null?"":" language=\""+label.getLanguage()+"\"") + 
				">" + Util.escapeForXML(value) + "</dcvalue>";
	}

}
