package databases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import databases.services.mybatis.batiservices.*;
import databases.models.*;

public class MainMyBatis {
    private static final Logger LOGGER = LogManager.getLogger(MainMyBatis.class);
    public static void main(String[] args) {
       TeachersServices teachersServices = new TeachersServices();
        for (Teachers t:teachersService.getAllTeachers()) {
            LOGGER.info(t);
        }


        Teachers teachers = new Teachers();
        teachersService.insert(teachers);


        Teachers teachers = teachersService.getById(1L);
        LOGGER.info(teachers);


        Teachers teachers = new Teachers();
        teachersService.update(teachers,3L);


        teachersServices.delete(4L);
    }
}
