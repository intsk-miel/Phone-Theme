package databases.services.mybatis.batiservices;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.io.Reader;

public class MyBatisMain {
    private final static Logger LOGGER = LogManager.getLogger(MyBatisMain.class);
    private static SqlSessionFactory factory;

    private MyBatisMain(){}
    static
    {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatisFiles/mybatis-config.xml");
        }catch (IOException e){
            LOGGER.error(e);
        }
        factory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return factory;
    }
}
