package databases.dao.jdbc;

import databases.models.Subjects;
import databases.dao.connector.ConnectionPool;
import databases.dao.interfaces.ISubjectsDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubjectsDAO extends AbstractMySqlDAO implements ISubjectsDAO {
    private static final Logger LOGGER = LogManager.getLogger(SubjectsDAO.class);

    @Override
    public Subjects getById(Long id)  {
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("select * from Subjects where id = ?");
            preparedStatement.setLong(1,id);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Subjects subjects = new Subjects();
            while (resultSet.next()){
                subjects.setId(resultSet.getLong("id"));
                subjects.setName(resultSet.getString("Name"));
                subjects.setMaxCapacity(resultSet.getInt("Max Capacity"));
                subjects.setSchoolId(resultSet.getLong("SchoolId"));
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
    public void insert(Subjects subjects) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement = ConnectionPool.getConnection().prepareStatement("insert into Subjects (name,maxcapacity,School_Id)  values ( ?,?,?)");
            preparedStatement.setString(1,subjects.getName());
            preparedStatement.setInt(2,subjects.getMaxCapacity());
            preparedStatement.setLong(3,subjects.getSchoolId());
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
    public void update(Subjects subjects) {
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=ConnectionPool.getConnection().prepareStatement("update Subjects set name = ? , maxcapacity = ? , School_Id = ?, where id = ?");
            preparedStatement.setString(1,subjects.getName());
            preparedStatement.setInt(2,subjects.getMaxCapacity());
            preparedStatement.setLong(3,subjects.getSchoolId());
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
            preparedStatement = ConnectionPool.getConnection().prepareStatement("Delete From Subjects where id = ?");
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
    public List<Subjects> getAllSubjects(){
        PreparedStatement preparedStatement=null;
        List<Subjects> subjectsList = new ArrayList<>();
        ResultSet resultSet=null;
        try{
            preparedStatement=ConnectionPool.getConnection().prepareStatement("Select * from Subjects");
            while (resultSet.next()){
                Subjects subjects = new Subjects();
                subjects.setId(resultSet.getLong("id"));
                subjects.setName(resultSet.getString("Name"));
                subjects.setMaxCapacity(resultSet.getInt("Max capacity"));
                subjects.setSchoolId(resultSet.getLong("SchoolId"));
                subjectsList.add(subjects);
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
