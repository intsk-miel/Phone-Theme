package databases.services.jdbc.connectionpool;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import databases.JdbcMain;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionPool {
    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
    public static Connection getConnection(){
        URL res = JdbcMain.class.getClassLoader().getResource("database.properties");
        try {
            Properties properties = new Properties();
            properties.load(res.openStream());
            String url = properties.getProperty("url");
            String userName = properties.getProperty("userName");
            String password = properties.getProperty("password");
            return DriverManager.getConnection(url, userName, password);
        } catch (SQLException | IOException | NullPointerException e) {
            LOGGER.error(e);
            e.printStackTrace();
            return null;
        }
    }
}
