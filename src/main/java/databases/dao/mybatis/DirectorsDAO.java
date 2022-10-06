package databases.dao.mybatis;

import databases.dao.interfaces.IDirectorsDAO;
import databases.models.Directors;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class DirectorsDAO {
    private final static Logger LOGGER = LogManager.getLogger(DirectorsDAO.class);

    public Directors getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IDirectorsDAO iDirectorsDAO = session.getMapper(IDirectorsDAO.class);
            return iDirectorsDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void insert(Directors object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IDirectorsDAO iDirectorsDAO = session.getMapper(IDirectorsDAO.class);
            iDirectorsDAO.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void update(Directors object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            IDirectorsDAO iDirectorsDAO = session.getMapper(IDirectorsDAO.class);
            iDirectorsDAO.update(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void delete(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IDirectorsDAO iDirectorsDAO = session.getMapper(IDirectorsDAO.class);
            iDirectorsDAO.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public List<Directors> getAllDirectors() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IDirectorsDAO iDirectorsDAO = session.getMapper(IDirectorsDAO.class);
            return iDirectorsDAO.getAllDirectors();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
