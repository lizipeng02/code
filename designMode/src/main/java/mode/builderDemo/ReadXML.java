package mode.builderDemo;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;
import java.net.URI;
import java.net.URL;

import static com.sun.javafx.scene.control.skin.Utils.getResource;

class ReadXML {
    public static Object getObject() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            Class clazz = new Object(){
                public Class getClassForStatic(){
                    return this.getClass();
                }
            }.getClassForStatic();
            doc = builder.parse(clazz.getResource("/config.xml").getFile());
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cname = classNode.getNodeValue();
            System.out.println("新类名：" + cname);
            Class<?> c = Class.forName(cname);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}