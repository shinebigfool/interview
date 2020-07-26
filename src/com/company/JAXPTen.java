package com.company;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;
import org.w3c.dom.*;
import org.w3c.dom.css.DocumentCSS;

import javax.xml.parsers.*;
import java.io.*;
public class JAXPTen {
	public static void main(String[] args) {
		ModifyNode modify = new ModifyNode();
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("4_2.xml"));
			Element root = document.getDocumentElement();
			NodeList nodeList = root.getChildNodes();
			modify.list(nodeList);
			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transformer = transFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			File file = new File("new4_2.xml");
			FileOutputStream out = new FileOutputStream(file);
			StreamResult xmlResult = new StreamResult(out);
			transformer.transform(domSource, xmlResult);
		}catch(Exception e){
			System.out.print(e);
		}
	}
	public static class ModifyNode{
		int m=0;
//		public void modifyNode(NodeList nodeList){
//			int size = nodeList.getLength();
//			for(int k = 0;k<size;k++){
//				Node node = nodeList.item(k);
//				if(node.getNodeType()==Node.TEXT_NODE){
//					Text textNode = (Text)node;
//					int length = textNode.getLength();
//					String str = textNode.getWholeText().trim();
//					try{
//						double d = Double.parseDouble(str);
//						if(d>90&&d<=100)
//							textNode.insertData(length, "(优秀)");
//						else if(d>=80&&d<90)
//							textNode.insertData(length, "(良好)");
//						else if(d>=60&&d<80)
//							textNode.insertData(length, "(及格)");
//						else
//							textNode.insertData(length, "(不及格)");
//					}catch(NumberFormatException e){
//
//					}
//				}
//				if(node.getNodeType()==Node.ELEMENT_NODE){
//					Element elementNode = (Element)node;
//					String name = elementNode.getNodeName();
//					if(elementNode.hasChildNodes()){
//						elementNode.setAttribute("考试性质", "闭卷");
//
//					}
//					NodeList nodes = elementNode.getChildNodes();
//					modifyNode(nodes);
//				}
//			}
//		}
		public void avg(NodeList nodeList){
			double mathSum = 0;
			double phySum = 0;
			int size = nodeList.getLength();
			for(int k = 0;k<size;k++){
				Node node = nodeList.item(k);
				System.out.println(node.getNodeName()+"  "+node.getNodeType());
			}
		}
		public void list(NodeList nodeList){
			for(int i=0;i<nodeList.getLength();i++){
				Element element = (Element)nodeList.item(i);
				Element math = (Element) element.getElementsByTagName("数学").item(0);
				Element phy = (Element)element.getElementsByTagName("物理").item(0);
				String mathScore = math.getTextContent();
				String phyScore = phy.getTextContent();
				System.out.println("math"+mathScore);
				System.out.println("phy"+phyScore);
			}
		}
	}
}
