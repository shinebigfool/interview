package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;//adaad

public class Analysis {
    public static void main(String[] args) {
        new Analysis().selectAll();
    }
    public List<Score> selectAll(){
        System.out.println("selecyAll()这是一行注释");
        List<Score> lists = new ArrayList<>();
        DocumentBuilderFactory bbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = bbf.newDocumentBuilder();
            // 3.使用DocumentBuilder解析一个xml路径，得到一个Document对象
            Document doc = builder.parse(new File("4_2.xml"));
            Element root = doc.getDocumentElement();
            // 获取所有的linkman
            NodeList scores = root.getChildNodes();
            for (int i = 0; i < scores.getLength(); i++){
                Element score = (Element)scores.item(i);
                Element mathE = (Element) score.getElementsByTagName("数学");
                Element phyE = (Element)score.getElementsByTagName("物理");
                int math = Integer.parseInt(mathE.getTextContent());
                int phy = Integer.parseInt(phyE.getTextContent());
                Score s = new Score(math,phy);
                System.out.println(s);
                lists.add(s);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return lists;
    }
}
