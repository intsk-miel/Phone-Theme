package json;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadJson {
    private static final Logger LOGGER = LogManager.getLogger(ReadJson.class);
    public static void main(String[] args){
        ObjectMapper objectMapper =new ObjectMapper();
        try {
            JavaType javaType = objectMapper.getTypeFactory().constructCollectionType(List.class, Teachers.class);
            List<Teachers> teachersList = objectMapper.readValue(new File("src/main/resources/json files/Teachers.json"), javaType);
            LOGGER.info(teachersList);
        }catch (IOException ex){
            LOGGER.error(ex);
        }
    }
}
