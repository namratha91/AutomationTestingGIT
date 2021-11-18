package com.sgsoftware.xmldemo;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ReadXMLFileDataDemo {
	public static String FileName=System.getProperty("user.dir")+"\\XMLFile\\Emp.xml";
	public static void main(String[] args) {
		SAXParserFactory factory = SAXParserFactory.newInstance();

        try {

            SAXParser saxParser = factory.newSAXParser();

            DemoHandler handler = new DemoHandler();
            saxParser.parse(FileName, handler);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

	}

}
