package xml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class JaxbMarshall {
    private static final Logger LOGGER = LogManager.getLogger(JaxbMarshall.class);
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Teachers.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            Teachers teachers = new Teachers() {
                {
                    Teacher teacher = new Teacher(3, "ia", "intskirveli", new Date(29128193), "Batumi", 55439283, "Biology", "intsk@gmail.com");
                    this.addTeacher(teacher);
                }
            };
            jaxbMarshaller.marshal(teachers, new File("src\\main\\resources\\xml files\\TeachersJaxb.xml"));
        } catch (JAXBException e) {
            LOGGER.error(e);
        }
    }
}
