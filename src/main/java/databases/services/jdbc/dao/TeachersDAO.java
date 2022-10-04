package databases.services.jdbc.dao;

import databases.models.Teachers;
import databases.services.jdbc.AbstractMySqlDAO;
import databases.services.jdbc.connectionpool.ConnectionPool;
import databases.services.jdbc.dao.interfacesDAO.ITeachersDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeachersDAO extends AbstractMySqlDAO implements ITeachersDAO {
    private static final Logger LOGGER = LogManager.getLogger(TeachersDAO.class);
    @Override
    public void create(Teachers teachers) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=ConnectionPool.getConnection().prepareStatement("insert into teachers (first_name,last_name,Date_Of_Birth,phone_number,city,email,School_Id)  values ( ?,?,?,?,?,?,?)");
            preparedStatement.setString(1,teachers.getFirstName());
            preparedStatement.setString(2,teachers.getLastName());
            preparedStatement.setDate(3, (Date) teachers.getDateOfBirth());
            preparedStatement.setInt(3,teachers.getPhoneNumber());
            preparedStatement.setString(3,teachers.getCity());
            preparedStatement.setString(3,teachers.getEmail());
            preparedStatement.setLong(3,teachers.getSchoolId());
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
    public static Teachers getById(Teachers teachers, Long id)  {
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("select * from teachers where id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            while (resultSet.next()){
                teachers.setId(resultSet.getLong("id"));
                teachers.setFirstName(resultSet.getString("FirstName"));
                teachers.setLastName(resultSet.getString("LastName"));
                teachers.setDateOfBirth(resultSet.getDate("DateOfBirth"));
                teachers.setPhoneNumber(resultSet.getInt("PhoneNumber"));
                teachers.setCity(resultSet.getString("City"));
                teachers.setEmail(resultSet.getString("Email"));
                teachers.setSchoolId(resultSet.getLong("SchoolId"));
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
    public void remove(Long id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("Delete From teachers where id = ?");
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
    public void update(Teachers teachers) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=ConnectionPool.getConnection().prepareStatement("update teachers set first_name = ? ,last_name = ? ,Date_Of_Birth = ? ,phone_number = ? ,city = ? ,email = ? ,School_Id = ?, where id = ?");
            preparedStatement.setString(1,teachers.getFirstName());
            preparedStatement.setString(2,teachers.getLastName());
            preparedStatement.setDate(3, (Date) teachers.getDateOfBirth());
            preparedStatement.setInt(3,teachers.getPhoneNumber());
            preparedStatement.setString(3,teachers.getCity());
            preparedStatement.setString(3,teachers.getEmail());
            preparedStatement.setLong(3,teachers.getSchoolId());
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
    public List<Teachers> getAllTeachers(){
        PreparedStatement preparedStatement=null;
        List<Teachers> teachersList = new ArrayList<>();
        ResultSet resultSet=null;
        try{
            preparedStatement=ConnectionPool.getConnection().prepareStatement("Select * from teachers");
            while (resultSet.next()){
                Teachers teachers = new Teachers();
                teachers.setId(resultSet.getLong("id"));
                teachers.setFirstName(resultSet.getString("FirstName"));
                teachers.setLastName(resultSet.getString("LastName"));
                teachers.setDateOfBirth(resultSet.getDate("DateOfBirth"));
                teachers.setPhoneNumber(resultSet.getInt("PhoneNumber"));
                teachers.setCity(resultSet.getString("City"));
                teachers.setEmail(resultSet.getString("Email"));
                teachers.setSchoolId(resultSet.getLong("SchoolId"));
                teachersList.add(teachers);
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
