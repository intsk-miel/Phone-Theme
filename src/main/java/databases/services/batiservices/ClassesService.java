package databases.services.batiservices;

import databases.models.Classes;
import databases.services.batiservices.mappers.IClassesMapper;
import databases.services.batiservices.interfaceservicebatis.IClassesService;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ClassesService implements IClassesService {
    private final static Logger LOGGER = LogManager.getLogger(ClassesService.class);
    @Override
    public Classes getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IClassesMapper iClassesMapper = session.getMapper(IClassesMapper.class);
            return iClassesMapper.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void insert(Classes object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IClassesMapper iClassesMapper = session.getMapper(IClassesMapper.class);
            iClassesMapper.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void update(Classes object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            IClassesMapper iClassesMapper = session.getMapper(IClassesMapper.class);
            iClassesMapper.update(object);
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
            IClassesMapper iClassesMapper = session.getMapper(IClassesMapper.class);
            iClassesMapper.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public List<Classes> getAllClasses() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IClassesMapper iClassesMapper = session.getMapper(IClassesMapper.class);
            return iClassesMapper.getAllClasses();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
