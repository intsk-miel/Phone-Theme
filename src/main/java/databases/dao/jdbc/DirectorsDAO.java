package databases.dao.jdbc;

import databases.models.Classes;
import databases.models.Directors;
import databases.dao.connector.ConnectionPool;
import databases.dao.interfaces.IDirectorsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DirectorsDAO extends AbstractMySqlDAO implements IDirectorsDAO {
    private static final Logger LOGGER = LogManager.getLogger(DirectorsDAO.class);

    @Override
    public Directors getById(Long id)  {
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("select * from directors where id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Directors directors = new Directors();
            while (resultSet.next()){
                directors.setId(resultSet.getLong("id"));
                directors.setFirstName(resultSet.getString("FirstName"));
                directors.setLastName(resultSet.getString("LastName"));
                directors.setDateOfBirth(resultSet.getDate("DateOfBirth"));
                directors.setPhoneNumber(resultSet.getInt("PhoneNumber"));
                directors.setCity(resultSet.getString("City"));
                directors.setEmail(resultSet.getString("Email"));
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
    public void insert(Directors directors) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement= ConnectionPool.getConnection().prepareStatement("insert into directors (first_name,last_name,Date_Of_Birth,phone_number,city,email)  values ( ?,?,?,?,?,?)");
            preparedStatement.setString(1,directors.getFirstName());
            preparedStatement.setString(2,directors.getLastName());
            preparedStatement.setDate(3, (Date) directors.getDateOfBirth());
            preparedStatement.setInt(4,directors.getPhoneNumber());
            preparedStatement.setString(5,directors.getCity());
            preparedStatement.setString(6,directors.getEmail());
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
    public void update(Directors directors) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=ConnectionPool.getConnection().prepareStatement("update directors set first_name = ? ,last_name = ? ,Date_Of_Birth = ? ,phone_number = ? ,city = ? ,email = ? ,where id = ?");
            preparedStatement.setString(1,directors.getFirstName());
            preparedStatement.setString(2,directors.getLastName());
            preparedStatement.setDate(3, (Date) directors.getDateOfBirth());
            preparedStatement.setInt(3,directors.getPhoneNumber());
            preparedStatement.setString(3,directors.getCity());
            preparedStatement.setString(3,directors.getEmail());
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
            preparedStatement = ConnectionPool.getConnection().prepareStatement("Delete From directors where id = ?");
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
    public List<Directors> getAllDirectors(){
        PreparedStatement preparedStatement=null;
        List<Directors> directorsList = new ArrayList<>();
        ResultSet resultSet=null;
        try{
            preparedStatement=ConnectionPool.getConnection().prepareStatement("Select * from directors");
            while (resultSet.next()){
                Directors directors = new Directors();
                directors.setId(resultSet.getLong("id"));
                directors.setFirstName(resultSet.getString("FirstName"));
                directors.setLastName(resultSet.getString("LastName"));
                directors.setDateOfBirth(resultSet.getDate("DateOfBirth"));
                directors.setPhoneNumber(resultSet.getInt("PhoneNumber"));
                directors.setCity(resultSet.getString("City"));
                directors.setEmail(resultSet.getString("Email"));
                directorsList.add(directors);
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
