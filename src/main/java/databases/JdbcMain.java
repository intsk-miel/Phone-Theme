package databases;

import databases.models.Teachers;
import databases.services.jdbc.dao.TeachersDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JdbcMain {
    private static final Logger LOGGER = LogManager.getLogger(JdbcMain.class);
    public static void main(String[] args){
//        TeachersDAO teachers = new TeachersDAO();

        Teachers teachers = new Teachers();
        TeachersDAO.getById(teachers,12L);     //select by id
        LOGGER.info(teachers);

    }
}
