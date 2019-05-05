package com.rs.xsd.validator;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLValidator {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		// awareness true if the parser produced will provide support for XML
		// namespaces; false otherwise.
		documentBuilderFactory.setNamespaceAware(true);
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		documentBuilder.setErrorHandler(new CustomErrorHandler());
		// Document document = documentBuilder.parse("src/xml/union_types.xml");
		Document document1 = documentBuilder.parse("src/xml/union_types2.xml");
		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		Schema schema = schemaFactory.newSchema(new File("src/xml/union_types.xsd"));
		Validator validator = schema.newValidator();
		// validator.validate(new DOMSource(document));
		validator.validate(new DOMSource(document1));
		System.out.println("Document is valid");
	}
}
