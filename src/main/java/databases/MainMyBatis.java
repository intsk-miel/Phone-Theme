package databases;

import databases.dao.mybatis.ClassesDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import databases.models.*;

public class MainMyBatis {
    private static final Logger LOGGER = LogManager.getLogger(MainMyBatis.class);
    public static void main(String[] args) {
        ClassesDAO classesDAO = new ClassesDAO();
        for (Classes c: classesDAO.getAllClasses()) {
            LOGGER.info(c);                                         //selectAll
        }


//        Classes classes = new Classes();
//        classesService.insert(classes);                //insert


//        Teachers teachers = teachersService.getById(1L);
//        LOGGER.info(teachers);                                  //getById


//        Teachers teachers = new Teachers();
//        teachersService.update(teachers,3L);    //update


//        teachersService.delete(4L);  //delete
    }
}
