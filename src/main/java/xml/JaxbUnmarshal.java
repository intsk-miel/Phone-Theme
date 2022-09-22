package xml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshal {
    private static final Logger LOGGER = LogManager.getLogger(JaxbUnmarshal.class);
    public static void main(String[] args)  {
       try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Teachers.class);
            Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
            FileReader teacherJaxb = new FileReader("C:\\Users\\user\\IdeaProjects\\PhoneTheme\\src\\main\\resources\\xml files\\TeachersJaxb.xml");
            Teachers tt = (Teachers)jaxbUnMarshaller.unmarshal(teacherJaxb);
            LOGGER.info(tt);
        } catch (JAXBException | FileNotFoundException ex){
            LOGGER.error(ex);
         }
    }
}
