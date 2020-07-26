package com.company;
import com.sun.istack.internal.Nullable;
import org.w3c.dom.*;
import org.xml.sax.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
public class myXML {
    private Document document = null;
    public void createXml(String fileName)
    {//创建xml文档
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            this.document = db.newDocument();//创建xml与解析xml不同的地方
            document.normalize();
        }
        catch(ParserConfigurationException e)
        {
            System.out.println(e.getMessage());
        }
        Element root = this.document.createElement("booking-list");//创建根节点
        this.document.appendChild(root);
        TransformerFactory tf = TransformerFactory.newInstance();
        try
        {
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(document);
            PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
            StreamResult result = new StreamResult(pw);
            transformer.transform(source, result);
            System.out.println("生成XML文件成功");
        } catch(TransformerException | FileNotFoundException | IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void parserXML(String fileName)
    {//解析xml文档
        try
        {
            try
            {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                this.document = db.parse(fileName); //解析xml与创建xml不同的地方
                this.document.normalize();
                //Document document = db.parse(fileName);
            }
            catch(ParserConfigurationException e)
            {
                System.out.println(e.getMessage());
            }
            NodeList employees = document.getChildNodes();
            for(int i = 0; i < employees.getLength(); i++)
            {
                Node employee = employees.item(i);
                NodeList employeeInfo  =employee.getChildNodes();
                for(int j = 0; j < employeeInfo.getLength(); j++)
                {
                    Node node = employeeInfo.item(j);
                    NodeList employeeMeta = node.getChildNodes();
                    for(int k = 0;k < employeeMeta.getLength(); k++)
                    {
                        System.out.println(employeeMeta.item(k).getNodeName() + ":" + employeeMeta.item(k).getTextContent());
                    }
                }
            }
            System.out.println("解析完毕");
        } catch(SAXException | IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void addNode(String fileName, String nodeName, String fatherNodeName)
    {//在一指定的xml文档中，父节点下添加一个节点
        try
        {
            //得到DOM解析器的工厂实例
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            //从DOM工厂里获取DOM解析器
            DocumentBuilder db = dbf.newDocumentBuilder();
            //解析XML文档，得到document, 即DOM树
            this.document = db.parse(fileName);
            //去掉XML文档中作为格式化内容的空白而映射在DOM树中的不必要的Text Node对象
            this.document.normalize();
            //创建一个标签
            Element myname =document.createElement(nodeName);//创建一个节点
//			myname.setAttribute("name", "xxxx");//为该标签添加名字属性
//			Element mybook=document.createElement("mybook");
//			mybook.setAttribute("id", "Date Structure");
//			mybook.setAttribute("name", "423");
            //添加父子关系
//			myname.appendChild(mybook);
            //将标签添加到父标签里
            Element fatherElement=(Element)document.getElementsByTagName(fatherNodeName).item(0);
            fatherElement.appendChild(myname);
            //保存xml文档
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            //设置编码类型
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            StreamResult result = new StreamResult(new FileOutputStream(fileName));
            //把DOM树转换为xml文档
            transformer.transform(source, result);
            System.out.println("节点添加完毕");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void addNode(String fileName, String nodeName, String fatherNodeName,String text)
    {//在一指定的xml文档中，父节点下添加一个节点
        try
        {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            this.document = db.parse(fileName);
            this.document.normalize();
            Element myname =document.createElement(nodeName);//创建一个节点
            myname.setTextContent(text);
            Element fatherElement=(Element)document.getElementsByTagName(fatherNodeName).item(0);
            fatherElement.appendChild(myname);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            StreamResult result = new StreamResult(new FileOutputStream(fileName));
            transformer.transform(source, result);
            System.out.println("节点添加完毕");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void removeNode(String fileName,String nodeName,String childName){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            this.document = db.parse(fileName);
            this.document.normalize();
            Element node = (Element)document.getElementsByTagName(nodeName).item(0);
            System.out.println(node.getTagName());
            //System.out.println(node.getNodeName());
            Element childNode = (Element)document.getElementsByTagName(childName).item(0);
            //System.out.println(childNode.getTagName());
            node.removeChild(childNode);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            StreamResult result = new StreamResult(new FileOutputStream(fileName));
            transformer.transform(source, result);
            System.out.println("节点删除完毕");
        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        myXML dd=new myXML();
        String XMLName="mykrpano.xml";
 //       dd.removeNode(XMLName,"订单","客户");
        //创建xml文档
        //dd.createXml(XMLName);

        //解析xml文档
        dd.parserXML(XMLName);
//
//        dd.addNode(XMLName, "订单", "booking-list");
//        dd.addNode(XMLName, "客户", "订单","王明山");
//        dd.addNode(XMLName, "金额", "订单","20000.00");
//        dd.addNode(XMLName, "城市", "订单","郑州");
//        dd.addNode(XMLName, "邮编", "订单","450002");
    }

}