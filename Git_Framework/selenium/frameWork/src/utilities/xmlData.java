package utilities;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;

public class xmlData {
	
	static String filename;
	static String fip;
	static DocumentBuilderFactory factor;
	static DocumentBuilder builder;
	static Document doc;
	
	public xmlData(String filename) throws ParserConfigurationException, SAXException, IOException {
		this.filename=filename;
		fip=new File(System.getProperty("user.dir"))+filename;
		factor=DocumentBuilderFactory.newInstance();
		builder=factor.newDocumentBuilder();
		doc=builder.parse(fip);
	}
	
	public String getData(String tagname, int index) {
		NodeList nList=doc.getElementsByTagName(tagname);
		Node node=nList.item(index);
		Element element=(Element)node;
		return element.getTextContent();
	}
}
