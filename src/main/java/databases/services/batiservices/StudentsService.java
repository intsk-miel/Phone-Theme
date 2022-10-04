package databases.services.batiservices;

import databases.models.Students;
import databases.services.mappers.IStudentsMapper;
import databases.services.batiservices.interfaceservicebatis.IStudentsService;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class StudentsService implements IStudentsService {
    private final static Logger LOGGER = LogManager.getLogger(StudentsService.class);
    @Override
    public Students getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IStudentsMapper iStudentsMapper = session.getMapper(IStudentsMapper.class);
            return iStudentsMapper.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void insert(Students object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IStudentsMapper iStudentsMapper = session.getMapper(IStudentsMapper.class);
            iStudentsMapper.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void update(Students object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            IStudentsMapper iStudentsMapper = session.getMapper(IStudentsMapper.class);
            iStudentsMapper.update(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void delete(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IStudentsMapper iStudentsMapper = session.getMapper(IStudentsMapper.class);
            iStudentsMapper.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public List<Students> getAllStudents() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IStudentsMapper iStudentsMapper = session.getMapper(IStudentsMapper.class);
            return iStudentsMapper.getAllStudents();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
