package databases.services.batiservices;

import databases.models.Teachers;
import databases.services.batiservices.interfaceservicebatis.ITeachersService;
import databases.services.mappers.ITeachersMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;


public class TeachersService implements ITeachersService {
    private final static Logger LOGGER = LogManager.getLogger(TeachersService.class);
    @Override
    public Teachers getById(Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ITeachersMapper iTeachersMapper = session.getMapper(ITeachersMapper.class);
            return iTeachersMapper.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void insert(Teachers object) {
        SqlSession session  = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ITeachersMapper iTeachersMapper = session.getMapper(ITeachersMapper.class);
            iTeachersMapper.insert(object);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public void update(Teachers object, Long id) {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            object.setId(id);
            ITeachersMapper iTeachersMapper = session.getMapper(ITeachersMapper.class);
            iTeachersMapper.update(object);
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
            ITeachersMapper iTeachersMapper = session.getMapper(ITeachersMapper.class);
            iTeachersMapper.delete(id);
            session.commit();
        }finally {
            session.rollback();
            session.close();
        }
    }

    @Override
    public List<Teachers> getAllTeachers() {
        SqlSession session = MyBatisMain.getSqlSessionFactory().openSession();
        try {
            ITeachersMapper iTeachersMapper = session.getMapper(ITeachersMapper.class);
            return iTeachersMapper.getAllTeachers();
        }finally {
            session.rollback();
            session.close();
        }
    }
}
