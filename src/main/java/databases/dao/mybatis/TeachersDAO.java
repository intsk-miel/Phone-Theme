package databases.dao.mybatis;

import databases.dao.interfaces.ITeachersDAO;
import databases.models.Teachers;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;


public class TeachersDAO{
    private final static Logger LOGGER = LogManager.getLogger(TeachersDAO.class);

    public Teachers getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ITeachersDAO iTeachersDAO = session.getMapper(ITeachersDAO.class);
            return iTeachersDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void insert(Teachers object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ITeachersDAO iTeachersDAO = session.getMapper(ITeachersDAO.class);
            iTeachersDAO.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    public void update(Teachers object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            ITeachersDAO iTeachersDAO = session.getMapper(ITeachersDAO.class);
            iTeachersDAO.update(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void delete(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ITeachersDAO iTeachersDAO = session.getMapper(ITeachersDAO.class);
            iTeachersDAO.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    public List<Teachers> getAllTeachers() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ITeachersDAO iTeachersDAO = session.getMapper(ITeachersDAO.class);
            return iTeachersDAO.getAllTeachers();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
