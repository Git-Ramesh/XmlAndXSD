package com.rs.xsd.validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class CustomErrorHandler implements ErrorHandler {

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		System.out.println("--- warning");
	}

	@Override
	public void error(SAXParseException exception) throws SAXException {
		System.out.println("--- error");
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		System.out.println("--- fatalError");
	}

}
