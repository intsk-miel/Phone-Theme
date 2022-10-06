package databases;

import databases.dao.jdbc.TeachersDAO;
import databases.models.Teachers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class JdbcMain {
    private static final Logger LOGGER = LogManager.getLogger(JdbcMain.class);
    public static void main(String[] args){
        TeachersDAO teachersDAO = new TeachersDAO();

        Teachers teachers1 = teachersDAO.getById(1L);      //select by id
        LOGGER.info(teachers1);

        Teachers teachers2 = new Teachers();    //insert
        teachersDAO.insert(teachers2);


        teachersDAO.delete(5L);                                            //remove


        Teachers teachers3 = new Teachers();
        teachersDAO.update(teachers3);                                                                                //update

        for (Teachers t: teachersDAO.getAllTeachers()) {
            LOGGER.info(t);                                                  //select all
        }


    }
}
