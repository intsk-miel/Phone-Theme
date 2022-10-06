package databases.dao.mybatis;

import databases.dao.interfaces.ISchoolsDAO;
import databases.models.Schools;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class SchoolsDAO {
    private final static Logger LOGGER = LogManager.getLogger(SchoolsDAO.class);

    public Schools getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISchoolsDAO iSchoolsDAO = session.getMapper(ISchoolsDAO.class);
            return iSchoolsDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void insert(Schools object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISchoolsDAO iSchoolsDAO = session.getMapper(ISchoolsDAO.class);
            iSchoolsDAO.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void update(Schools object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            ISchoolsDAO iSchoolsDAO = session.getMapper(ISchoolsDAO.class);
            iSchoolsDAO.update(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void delete(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISchoolsDAO iSchoolsDAO = session.getMapper(ISchoolsDAO.class);
            iSchoolsDAO.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public List<Schools> getAllSchools() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISchoolsDAO iSchoolsDAO = session.getMapper(ISchoolsDAO.class);
            return iSchoolsDAO.getAllSchools();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
