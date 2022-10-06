package databases.dao.jdbc;

import databases.models.Students;
import databases.dao.connector.ConnectionPool;
import databases.dao.interfaces.IStudentsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsDAO extends AbstractMySqlDAO implements IStudentsDAO {
    private static final Logger LOGGER = LogManager.getLogger(StudentsDAO.class);

    @Override
    public Students getById(Long id)  {
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("select * from students where id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Students students = new Students();
            while (resultSet.next()){
                students.setId(resultSet.getLong("id"));
                students.setFirstName(resultSet.getString("FirstName"));
                students.setLastName(resultSet.getString("LastName"));
                students.setDateOfBirth(resultSet.getDate("DateOfBirth"));
                students.setPhoneNumber(resultSet.getInt("PhoneNumber"));
                students.setAddress(resultSet.getString("Address"));
                students.setEmail(resultSet.getString("Email"));
                students.setSchoolId(resultSet.getLong("SchoolId"));
                students.setSubjectId(resultSet.getLong("SubjectId"));
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
    public void insert(Students students) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement= ConnectionPool.getConnection().prepareStatement("insert into students (first_name,last_name,Date_Of_Birth,phone_number,address,email,School_Id,Subject_Id)  values ( ?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,students.getFirstName());
            preparedStatement.setString(2,students.getLastName());
            preparedStatement.setDate(3, (Date) students.getDateOfBirth());
            preparedStatement.setInt(4,students.getPhoneNumber());
            preparedStatement.setString(5,students.getAddress());
            preparedStatement.setString(6,students.getEmail());
            preparedStatement.setLong(7,students.getSchoolId());
            preparedStatement.setLong(8,students.getSubjectId());
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
    public void update(Students students) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=ConnectionPool.getConnection().prepareStatement("update students set first_name = ? ,last_name = ? ,Date_Of_Birth = ? ,phone_number = ? ,address = ? ,email = ? ,School_Id = ?, Subject_Id = ? ,where id = ?");
            preparedStatement.setString(1,students.getFirstName());
            preparedStatement.setString(2,students.getLastName());
            preparedStatement.setDate(3, (Date) students.getDateOfBirth());
            preparedStatement.setInt(3,students.getPhoneNumber());
            preparedStatement.setString(3,students.getAddress());
            preparedStatement.setString(3,students.getEmail());
            preparedStatement.setLong(3,students.getSchoolId());
            preparedStatement.setLong(3,students.getSubjectId());
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
            preparedStatement = ConnectionPool.getConnection().prepareStatement("Delete From students where id = ?");
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
    public List<Students> getAllStudents(){
        PreparedStatement preparedStatement=null;
        List<Students> studentsList = new ArrayList<>();
        ResultSet resultSet=null;
        try{
            preparedStatement=ConnectionPool.getConnection().prepareStatement("Select * from students");
            while (resultSet.next()){
                Students students = new Students();
                students.setId(resultSet.getLong("id"));
                students.setFirstName(resultSet.getString("FirstName"));
                students.setLastName(resultSet.getString("LastName"));
                students.setDateOfBirth(resultSet.getDate("DateOfBirth"));
                students.setPhoneNumber(resultSet.getInt("PhoneNumber"));
                students.setAddress(resultSet.getString("Address"));
                students.setEmail(resultSet.getString("Email"));
                students.setSchoolId(resultSet.getLong("SchoolId"));
                students.setSubjectId(resultSet.getLong("SubjectId"));
                studentsList.add(students);
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
