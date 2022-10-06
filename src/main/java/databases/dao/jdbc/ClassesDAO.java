package databases.dao.jdbc;

import databases.models.Classes;
import databases.dao.connector.ConnectionPool;
import databases.dao.interfaces.IClassesDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassesDAO extends AbstractMySqlDAO implements IClassesDAO  {
    private static final Logger LOGGER = LogManager.getLogger(ClassesDAO.class);

    @Override
    public Classes getById(Long id)  {
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("select * from classes where id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Classes classes = new Classes();
            while (resultSet.next()){
                classes.setId(resultSet.getLong("id"));
                classes.setTeacherId(resultSet.getLong("TeacherId"));
                classes.setSubjectId(resultSet.getLong("SubjectId"));
                classes.setSchoolId(resultSet.getLong("SchoolId"));
                classes.setTime(resultSet.getDouble("Time"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.error(e);
        }finally {
            try {
                resultSet.close();
                preparedStatement.close();
                ConnectionPool.getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
                LOGGER.error(e);
            }
        }
        return null;
    }

    @Override
    public void insert(Classes classes) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement= ConnectionPool.getConnection().prepareStatement("insert into classes (Teacher_Id,Subject_Id,School_Id,Time)  values (?,?,?,?)");
            preparedStatement.setLong(1,classes.getTeacherId());
            preparedStatement.setLong(2,classes.getSubjectId());
            preparedStatement.setLong(3, classes.getSchoolId());
            preparedStatement.setDouble(4,classes.getTime());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.error(e);
        } finally{
            try {
                preparedStatement.close();
                ConnectionPool.getConnection().close();
            } catch (SQLException e) {
                LOGGER.error(e);
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(Classes classes) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=ConnectionPool.getConnection().prepareStatement("update classes set Teacher_Id = ? ,Subject_Id = ? ,School_Id = ?, Time = ? ,where id = ?");
            preparedStatement.setLong(1,classes.getTeacherId());
            preparedStatement.setLong(2,classes.getSubjectId());
            preparedStatement.setLong(3, classes.getSchoolId());
            preparedStatement.setDouble(3,classes.getTime());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.warn(e);
        }finally {
            try{
                preparedStatement.close();
                ConnectionPool.getConnection().close();
            }catch (SQLException e){
                e.printStackTrace();
                LOGGER.error(e);
            }
        }
    }

    @Override
    public void delete(Long id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("Delete From classes where id = ?");
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.error(e);
        } finally {
            try {
                preparedStatement.close();
                ConnectionPool.getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
                LOGGER.error(e);
            }
        }
    }



    @Override
    public List<Classes> getAllClasses(){
        PreparedStatement preparedStatement=null;
        List<Classes> classesList  = new ArrayList<>();
        ResultSet resultSet=null;
        try{
            preparedStatement=ConnectionPool.getConnection().prepareStatement("Select * from classes");
            while (resultSet.next()){
                Classes classes = new Classes();
                classes.setId(resultSet.getLong("id"));
                classes.setTeacherId(resultSet.getLong("TeacherId"));
                classes.setSubjectId(resultSet.getLong("SubjectId"));
                classes.setSchoolId(resultSet.getLong("SchoolId"));
                classes.setTime(resultSet.getDouble("Time"));
                classesList.add(classes);
            }
        }catch (SQLException e){
            e.printStackTrace();
            LOGGER.warn(e);
        }finally {
            try{
                resultSet.close();
                preparedStatement.close();
                ConnectionPool.getConnection().close();
            }catch (SQLException e){
                e.printStackTrace();
                LOGGER.warn(e);
            }
        }
        return null;
    }
}
