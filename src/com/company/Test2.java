package com.company;
import javax.xml.parsers.*;
import org.w3c.dom.*;
public class Test2 {
    public static void main(String args[ ]){
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse("4_2.xml");
            Element root =doc.getDocumentElement();
            NodeList list =root.getChildNodes();
            double summ=0,sump=0;
            int count=0;
            double avgm=0,avgp=0;
            for(int i=0;i<list.getLength();i++){
                Node node=list.item(i);
                if(node.getNodeType()==Node.ELEMENT_NODE){
                    count++;
                    NodeList tlist= (( Element)node).getElementsByTagName("数学");
                    summ=summ+Double.parseDouble(tlist.item(0).getFirstChild().getNodeValue());
                    NodeList tlist1= (( Element)node).getElementsByTagName("物理");
                    sump=sump+Double.parseDouble(tlist1.item(0).getFirstChild().getNodeValue());

                }else{
                    System.out.println(node.getNodeType());
                }
            }
            avgm=summ/(count*1.0);
            avgp=sump/(count*1.0);

            System.out.println(avgm+"|"+avgp);
        }catch(Exception e){e.printStackTrace();}
    }
}