package databases.dao.mybatis;

import databases.dao.interfaces.IStudentsDAO;
import databases.models.Students;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class StudentsDAO  {
    private final static Logger LOGGER = LogManager.getLogger(StudentsDAO.class);

    public Students getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IStudentsDAO iStudentsDAO = session.getMapper(IStudentsDAO.class);
            return iStudentsDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void insert(Students object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IStudentsDAO iStudentsDAO = session.getMapper(IStudentsDAO.class);
            iStudentsDAO.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void update(Students object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            IStudentsDAO iStudentsDAO = session.getMapper(IStudentsDAO.class);
            iStudentsDAO.update(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void delete(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IStudentsDAO iStudentsDAO = session.getMapper(IStudentsDAO.class);
            iStudentsDAO.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public List<Students> getAllStudents() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IStudentsDAO iStudentsDAO = session.getMapper(IStudentsDAO.class);
            return iStudentsDAO.getAllStudents();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
