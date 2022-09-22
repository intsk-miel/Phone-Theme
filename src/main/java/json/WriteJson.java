package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class WriteJson {
    private static final Logger LOGGER = LogManager.getLogger(WriteJson.class);
    public static List<Teachers> getTeachers() {
        return List.of(
                new Teachers("ia", "intskirvei", new Date(283627273), 93758327, "intsk@gmail.com"),
                new Teachers("lizi", "sharadze", new Date(273838373), 19274536, "lizshr@gmail.com"),
                new Teachers("nia", "goguadze", new Date(873526748), 97264738,"niagog@gmail.com"),
                new Teachers("luka", "cinaridze", new Date(648391026), 27001235,"lukci@gmail.com")
        );
    }
    public static void main(String[] args){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/json files/WriteTeachers.json"),getTeachers());
        }catch (IOException ex){
            LOGGER.error(ex);
        }
    }


}
