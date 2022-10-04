package databases.services.batiservices;

import databases.models.Directors;
import databases.services.batiservices.mappers.IDirectorsMapper;
import databases.services.batiservices.interfaceservicebatis.IDirectorsService;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class DirectorsService implements IDirectorsService {
    private final static Logger LOGGER = LogManager.getLogger(DirectorsService.class);
    @Override
    public Directors getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IDirectorsMapper iDirectorsMapper = session.getMapper(IDirectorsMapper.class);
            return iDirectorsMapper.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void insert(Directors object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IDirectorsMapper iDirectorsMapper = session.getMapper(IDirectorsMapper.class);
            iDirectorsMapper.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void update(Directors object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            IDirectorsMapper iDirectorsMapper = session.getMapper(IDirectorsMapper.class);
            iDirectorsMapper.update(object);
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
            IDirectorsMapper iDirectorsMapper = session.getMapper(IDirectorsMapper.class);
            iDirectorsMapper.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public List<Directors> getAllDirectors() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            IDirectorsMapper iDirectorsMapper = session.getMapper(IDirectorsMapper.class);
            return iDirectorsMapper.getAllDirectors();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
