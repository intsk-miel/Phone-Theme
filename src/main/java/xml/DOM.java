package xml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOM {
    private static final Logger LOGGER = LogManager.getLogger(DOM.class);
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory buildFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = buildFactory.newDocumentBuilder();
        Document doc = builder.parse(new File("src\\main\\resources\\xml files\\TeachersJaxb.xml"));
        NodeList teacherList = doc.getElementsByTagName("teacher");
        for(int i = 0; i < teacherList.getLength(); i++){
            Node t = teacherList.item(i);
            if(t.getNodeType()==Node.ELEMENT_NODE){
                Element teacher = (Element) t;
                String id = teacher.getAttribute("id");
                NodeList nameList = teacher.getChildNodes();
                for(int j = 0; j<nameList.getLength(); j++){
                    Node n = nameList.item(j);
                    if(n.getNodeType()==Node.ELEMENT_NODE){
                        Element name = (Element) n;
                        LOGGER.info("Teacher" + id + ":" + name.getTagName() + "=" + name.getTextContent());
                    }
                }
            }
        }
    }
}
