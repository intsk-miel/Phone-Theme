package xml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshal {
    private static final Logger LOGGER = LogManager.getLogger(JaxbUnmarshal.class);
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Teacher.class);
            Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
            Teacher tt = (Teacher)jaxbUnMarshaller.unmarshal(new File("C:\\Users\\user\\IdeaProjects\\PhoneTheme\\src\\main\\resources\\xml files\\TeachersJaxb.xml"));
            LOGGER.info("Teacher id = " + tt.getId());
            LOGGER.info("Teacher first name = " + tt.getFirst_name());
            LOGGER.info("Teacher last name = " + tt.getLast_name());
            LOGGER.info("Teacher date of birth = " + tt.getDate_Of_Birth());
            LOGGER.info("Teacher phone number = " + tt.getPhone_number());
            LOGGER.info("Teacher city = " + tt.getCity());
            LOGGER.info("Teacher subject = " + tt.getSubject());
            LOGGER.info("Teacher email = " + tt.getEmail());
        } catch (JAXBException e){
            LOGGER.error(e);
        }
    }
}
