package reflection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.*;

public class Main {
    private final static Logger LOGGER = LogManager.getLogger(streaming.Main.class);
    public static void main(String[] args) {
        Class mobilePhone = Mobile.class;
        Constructor[] cc = mobilePhone.getDeclaredConstructors();
        for (Constructor cons : cc) {
            LOGGER.info("Constructor Name: " + cons.getName());
            int modifier = cons.getModifiers();
            String mod = Modifier.toString(modifier);
            LOGGER.info("Modifier: " + mod);
            LOGGER.info("Parameters: " + cons.getParameterCount());
        }


        Field[] ff = mobilePhone.getDeclaredFields();
        for (Field fie : ff){
            LOGGER.info("Field Name: " + fie.getName());
            int modifier = fie.getModifiers();
            String mod = Modifier.toString(modifier);
            LOGGER.info("Modifier: " + mod);
            LOGGER.info("Type: " + fie.getType());
        }


        Method[] mm = mobilePhone.getDeclaredMethods();
        for (Method m : mm) {
            LOGGER.info("Method Name: " + m.getName());
            int modifier = m.getModifiers();
            LOGGER.info("Modifier: " + Modifier.toString(modifier));
            LOGGER.info("Return Types: " + m.getReturnType());
        }
    }
}
