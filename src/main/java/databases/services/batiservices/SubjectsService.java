package databases.services.batiservices;


import databases.models.Subjects;
import databases.services.batiservices.interfaceservicebatis.ISubjectsService;
import databases.services.mappers.ISubjectsMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class SubjectsService implements ISubjectsService {
    private final static Logger LOGGER = LogManager.getLogger(SubjectsService.class);
    @Override
    public Subjects getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISubjectsMapper iSubjectsMapper = session.getMapper(ISubjectsMapper.class);
            return iSubjectsMapper.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void insert(Subjects object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISubjectsMapper iSubjectsMapper = session.getMapper(ISubjectsMapper.class);
            iSubjectsMapper.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void update(Subjects object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            ISubjectsMapper iSubjectsMapper = session.getMapper(ISubjectsMapper.class);
            iSubjectsMapper.update(object);
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
            ISubjectsMapper iSubjectsMapper = session.getMapper(ISubjectsMapper.class);
            iSubjectsMapper.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public List<Subjects> getAllSubjects() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISubjectsMapper iSubjectsMapper = session.getMapper(ISubjectsMapper.class);
            return iSubjectsMapper.getAllSubjects();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
