package databases.dao.mybatis;


import databases.dao.interfaces.ISubjectsDAO;
import databases.models.Subjects;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class SubjectsDAO {
    private final static Logger LOGGER = LogManager.getLogger(SubjectsDAO.class);

    public Subjects getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISubjectsDAO iSubjectsDAO = session.getMapper(ISubjectsDAO.class);
            return iSubjectsDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void insert(Subjects object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISubjectsDAO iSubjectsDAO = session.getMapper(ISubjectsDAO.class);
            iSubjectsDAO.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void update(Subjects object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            ISubjectsDAO iSubjectsDAO = session.getMapper(ISubjectsDAO.class);
            iSubjectsDAO.update(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public void delete(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISubjectsDAO iSubjectsDAO = session.getMapper(ISubjectsDAO.class);
            iSubjectsDAO.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }


    public List<Subjects> getAllSubjects() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISubjectsDAO iSubjectsDAO = session.getMapper(ISubjectsDAO.class);
            return iSubjectsDAO.getAllSubjects();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
