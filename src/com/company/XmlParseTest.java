package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlParseTest {
    public static void main(String[] args) {
        XmlParseTest test = new XmlParseTest();
        Linkman linkman = new Linkman();
        linkman.setId("5");
        linkman.setName("西门吹雪");
        linkman.setAddress("高新区创业园");
        linkman.setEmail("ximenchuixue@163.com");
//		test.insert(linkman);
//		test.delete("5");
        Linkman lkm = test.selectOneById("5");
        lkm.setName("张无忌");
        test.update(lkm);
        List<Linkman> list = new XmlParseTest().selectAll();
        for (Linkman lm : list) {
            System.err.println(lm);
        }
    }

    public void insert(Linkman linkman) {
        try {
            // 获取工厂对象
            DocumentBuilderFactory bbf = DocumentBuilderFactory.newInstance();
            // 获取构建对象
            DocumentBuilder builder = bbf.newDocumentBuilder();
            // 解析路径得到文档对象
            Document doc = builder.parse(new File("resource/linkman.xml"));
            // 获取根元素
            Element root = doc.getDocumentElement();
            // 创建linkman元素
            Element linkmanEl = doc.createElement("linkman");
            linkmanEl.setAttribute("id", linkman.getId());
            // 把linkman作为root的子节点
            root.appendChild(linkmanEl);
            // 创建name、address、email
            Element nameEl = doc.createElement("name");
            Element addressEl = doc.createElement("address");
            Element emailEl = doc.createElement("email");
            // 给他们赋值内容
            nameEl.setTextContent(linkman.getName());
            addressEl.setTextContent(linkman.getAddress());
            emailEl.setTextContent(linkman.getEmail());
            // 建立name、address、email和linkman标签的关系
            linkmanEl.appendChild(nameEl);
            linkmanEl.appendChild(addressEl);
            linkmanEl.appendChild(emailEl);

            // 同步 将内存中的xml树,写到文件中
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.transform(new DOMSource(doc), new StreamResult("resource/linkman.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Linkman linkman) {//id=5 name ="林青霞"
        try {
            // 获取工厂对象
            DocumentBuilderFactory bbf = DocumentBuilderFactory.newInstance();
            // 获取构建对象
            DocumentBuilder builder = bbf.newDocumentBuilder();
            // 解析路径得到文档对象
            Document doc = builder.parse(new File("resource/linkman.xml"));
            // 获取根元素
            Element root = doc.getDocumentElement();
            // 获取所有的Linkman元素
            NodeList nodeList = root.getElementsByTagName("linkman");
            for (int i = 0; i < nodeList.getLength(); i++) {
                // 获取linkman元素的id属性值,来判断
                Element linkmanEl = (Element) nodeList.item(i);
                String linkmanId = linkmanEl.getAttribute("id");
                if (linkmanId.equals(linkman.getId())) {
                    linkmanEl.getElementsByTagName("name").item(0).setTextContent(linkman.getName());
                    linkmanEl.getElementsByTagName("address").item(0).setTextContent(linkman.getAddress());
                    linkmanEl.getElementsByTagName("email").item(0).setTextContent(linkman.getEmail());
                    //同步
                    TransformerFactory.newInstance().newTransformer().transform(new DOMSource(doc),
                            new StreamResult("resource/linkman.xml"));
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            // 获取工厂对象
            DocumentBuilderFactory bbf = DocumentBuilderFactory.newInstance();
            // 获取构建对象
            DocumentBuilder builder = bbf.newDocumentBuilder();
            // 解析路径得到文档对象
            Document doc = builder.parse(new File("resource/linkman.xml"));
            // 获取根元素
            Element root = doc.getDocumentElement();
            // 获取所有的Linkman元素
            NodeList nodeList = root.getElementsByTagName("linkman");
            for (int i = 0; i < nodeList.getLength(); i++) {
                // 获取linkman元素的id属性值,来判断
                Element linkmanEl = (Element) nodeList.item(i);
                String linkmanId = linkmanEl.getAttribute("id");
                if (linkmanId.equals(id)) {
                    // 删除
                    root.removeChild(linkmanEl);
                    // 同步
                    TransformerFactory.newInstance().newTransformer().transform(new DOMSource(doc),
                            new StreamResult("resource/linkman.xml"));
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Linkman selectOneById(String id) {
        try {
            // 获取工厂对象
            DocumentBuilderFactory bbf = DocumentBuilderFactory.newInstance();
            // 获取构建对象
            DocumentBuilder builder = bbf.newDocumentBuilder();
            // 解析路径得到文档对象
            Document doc = builder.parse(new File("resource/linkman.xml"));
            // 获取根元素
            Element root = doc.getDocumentElement();
            // 获取所有的Linkman元素
            NodeList nodeList = root.getElementsByTagName("linkman");
            for (int i = 0; i < nodeList.getLength(); i++) {
                // 获取linkman元素的id属性值,来判断
                Element linkmanEl = (Element) nodeList.item(i);
                String linkmanId = linkmanEl.getAttribute("id");
                if (linkmanId.equals(id)) {
                    // 如果等于参数id,就去获取对应的name、address、email
                    String name = linkmanEl.getElementsByTagName("name").item(0).getTextContent();
                    String address = linkmanEl.getElementsByTagName("address").item(0).getTextContent();
                    String email = linkmanEl.getElementsByTagName("email").item(0).getTextContent();
                    // 创建Linkman对象
                    Linkman linkman = new Linkman();
                    linkman.setId(id);
                    linkman.setName(name);
                    linkman.setAddress(address);
                    linkman.setEmail(email);
                    return linkman;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Linkman> selectAll() {
        List<Linkman> list = new ArrayList<>();
        // Dom方法
        // 获取Document对象
        // 1.获取DocumentBuilderFactory对象
        DocumentBuilderFactory bbf = DocumentBuilderFactory.newInstance();
        // 2.使用DocumentBuilderFactory创建DocumentBuilder对象
        try {
            DocumentBuilder builder = bbf.newDocumentBuilder();
            // 3.使用DocumentBuilder解析一个xml路径，得到一个Document对象
            Document doc = builder.parse(new File("resource/linkman.xml"));
            // 获取根元素
            Element root = doc.getDocumentElement();
            // 获取所有的linkman
            NodeList linkmans = root.getElementsByTagName("linkman");
            for (int i = 0; i < linkmans.getLength(); i++) {
                // 遍历得到每一个linkman标签
                Element linkmanEl = (Element) linkmans.item(i);
                // 通过linkman标签 去获取name标签、address标签、email标签
                Element nameEl = (Element) linkmanEl.getElementsByTagName("name").item(0);
                Element addressEl = (Element) linkmanEl.getElementsByTagName("address").item(0);
                Element emailEl = (Element) linkmanEl.getElementsByTagName("email").item(0);
                // 获取name、address、email的值
                String name = nameEl.getTextContent();
                String address = addressEl.getTextContent();
                String email = emailEl.getTextContent();
                // 获取linkman标签的id属性
                String id = linkmanEl.getAttribute("id");

                // 创建Linkman对象
                Linkman linkman = new Linkman();
                linkman.setId(id);
                linkman.setName(name);
                linkman.setAddress(address);
                linkman.setEmail(email);
                // 将linkman对象添加到集合
                list.add(linkman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}