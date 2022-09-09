package enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        PhoneProperties pp = PhoneProperties.FIRSTPHONE;
        LOGGER.info("Type " + pp.getType());
        LOGGER.info("Battery " + pp.getType());
        LOGGER.info("Cameras " + pp.getNumberCameras());
        LOGGER.info("Memory " + pp.getNumberMemory());
    }
}
