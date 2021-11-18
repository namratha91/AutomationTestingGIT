package com.sgsoftware.xmldemo;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class DemoHandler extends DefaultHandler{
	
	StringBuilder currentValue = new StringBuilder();

	  @Override
	  public void startDocument() {
	      System.out.println("Start Document");
	  }

	  @Override
	  public void endDocument() {
	      System.out.println("End Document");
	  }

	  @Override
	  public void startElement(
	          String uri,
	          String localName,
	          String qName,
	          Attributes attributes) {

	      // reset the tag value
	      currentValue.setLength(0);

	      System.out.println("Start Element : "+ qName);
	      
	      if (qName.equalsIgnoreCase("employee")) {
	          // get tag's attribute by name
	          String id = attributes.getValue("id");
	          System.out.println("Employee ID : "+ id);
	      }
	     
	  }

	  @Override
	  public void endElement(String uri,
	                         String localName,
	                         String qName) {

	      System.out.println("End Element : "+ qName);

	      if (qName.equalsIgnoreCase("firstname")) {
	          System.out.println("FirstName : "+ currentValue.toString());
	      }

	      if (qName.equalsIgnoreCase("job")) {
	          System.out.println("Job : "+ currentValue.toString());
	      }

	      if (qName.equalsIgnoreCase("city")) {
	          System.out.println("City : "+ currentValue.toString());
	      }

	      if (qName.equalsIgnoreCase("state")) {
	          System.out.println("State : "+ currentValue.toString());
	      }

	  }

	  @Override
	  public void characters(char ch[], int start, int length) {
	      currentValue.append(ch, start, length);

	  }

}
