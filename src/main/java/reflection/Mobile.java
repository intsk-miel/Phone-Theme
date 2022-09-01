package reflection;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Mobile {
    private final static Logger LOGGER = LogManager.getLogger(Mobile.class);
    private String phoneType;
    private String color;

    public Mobile(String phoneType, String color) {
        this.phoneType = phoneType;
        this.color = color;
    }

    public String getPhoneType() {
        return phoneType;
    }
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    private void makeCall() {
        LOGGER.info("The phone is ringing");
    }
}
