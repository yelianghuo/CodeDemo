package thinkinjava.xml.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

public class XpathDemo {
    public static void main(String[] args) throws Exception{
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse("src/book.xml");

        XPathFactory factory = XPathFactory.newInstance();
        XPath xPath = factory.newXPath();
        Node node = (Node)xPath.evaluate("bookstore", document,  XPathConstants.NODE);
        System.out.println(node.getNodeName());
    }
}
