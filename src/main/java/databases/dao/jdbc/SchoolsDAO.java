package databases.dao.jdbc;


import databases.models.Classes;
import databases.models.Schools;
import databases.dao.connector.ConnectionPool;
import databases.dao.interfaces.ISchoolsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SchoolsDAO extends AbstractMySqlDAO implements ISchoolsDAO {
    private static final Logger LOGGER = LogManager.getLogger(SchoolsDAO.class);

    @Override
    public Schools getById(Long id)  {
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("select * from schools where id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Schools schools = new Schools();
            while (resultSet.next()){
                schools.setId(resultSet.getLong("id"));
                schools.setName(resultSet.getString("Name"));
                schools.setCity(resultSet.getString("City"));
                schools.setStreet(resultSet.getString("Street"));
                schools.setWebAddress(resultSet.getString("Web Address"));
                schools.setEmail(resultSet.getString("Email"));
                schools.setDirectorId(resultSet.getLong("DirectorId"));
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
    public void insert(Schools schools) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement= ConnectionPool.getConnection().prepareStatement("insert into schools (name,city,street,web_address,email,Director_Id)  values ( ?,?,?,?,?,?)");
            preparedStatement.setString(1,schools.getName());
            preparedStatement.setString(2,schools.getCity());
            preparedStatement.setString(3, schools.getStreet());
            preparedStatement.setString(4,schools.getWebAddress());
            preparedStatement.setString(6,schools.getEmail());
            preparedStatement.setLong(7,schools.getDirectorId());
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
    public void update(Schools schools) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=ConnectionPool.getConnection().prepareStatement("update schools set name = ? ,city = ? ,street = ? ,web_address = ? ,email = ? , Director_Id = ? ,where id = ?");
            preparedStatement.setString(1,schools.getName());
            preparedStatement.setString(2,schools.getCity());
            preparedStatement.setString(3, schools.getStreet());
            preparedStatement.setString(4,schools.getWebAddress());
            preparedStatement.setString(5,schools.getEmail());
            preparedStatement.setLong(6,schools.getDirectorId());
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
            preparedStatement = ConnectionPool.getConnection().prepareStatement("Delete From schools where id = ?");
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
    public List<Schools> getAllSchools(){
        PreparedStatement preparedStatement=null;
        List<Schools> schoolsList  = new ArrayList<>();
        ResultSet resultSet=null;
        try{
            preparedStatement=ConnectionPool.getConnection().prepareStatement("Select * from schools");
            while (resultSet.next()){
                Schools schools = new Schools();
                schools.setId(resultSet.getLong("id"));
                schools.setName(resultSet.getString("Name"));
                schools.setCity(resultSet.getString("City"));
                schools.setStreet(resultSet.getString("Street"));
                schools.setWebAddress(resultSet.getString("Web Address"));
                schools.setEmail(resultSet.getString("Email"));
                schools.setDirectorId(resultSet.getLong("DirectorId"));
                schoolsList.add(schools);
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
