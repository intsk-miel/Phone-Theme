package databases.services.mybatis.batiservices;

import databases.models.Schools;
import databases.services.mybatis.batiservices.interfaceservicebatis.ISchoolsService;
import databases.services.mybatis.mappers.ISchoolsMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class SchoolsService implements ISchoolsService{
    private final static Logger LOGGER = LogManager.getLogger(SchoolsService.class);
    @Override
    public Schools getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISchoolsMapper iSchoolsMapper = session.getMapper(ISchoolsMapper.class);
            return iSchoolsMapper.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void insert(Schools object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISchoolsMapper iSchoolsMapper = session.getMapper(ISchoolsMapper.class);
            iSchoolsMapper.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void update(Schools object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            ISchoolsMapper iSchoolsMapper = session.getMapper(ISchoolsMapper.class);
            iSchoolsMapper.update(object);
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
            ISchoolsMapper iSchoolsMapper = session.getMapper(ISchoolsMapper.class);
            iSchoolsMapper.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public List<Schools> getAllSchools() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ISchoolsMapper iSchoolsMapper = session.getMapper(ISchoolsMapper.class);
            return iSchoolsMapper.getAllSchools();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
