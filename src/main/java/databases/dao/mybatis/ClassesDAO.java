package databases.dao.mybatis;

import databases.dao.interfaces.IClassesDAO;
import databases.models.Classes;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ClassesDAO  {
    private final static Logger LOGGER = LogManager.getLogger(ClassesDAO.class);

    public Classes getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IClassesDAO iClassesDAO= session.getMapper(IClassesDAO.class);
            return iClassesDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void insert(Classes object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IClassesDAO iClassesDAO = session.getMapper(IClassesDAO.class);
            iClassesDAO.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void update(Classes object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            IClassesDAO iClassesDAO = session.getMapper(IClassesDAO.class);
            iClassesDAO.update(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void delete(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IClassesDAO iClassesDAO = session.getMapper(IClassesDAO.class);
            iClassesDAO.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public List<Classes> getAllClasses() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IClassesDAO iClassesDAO = session.getMapper(IClassesDAO.class);
            return iClassesDAO.getAllClasses();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
