package theme;

import interfaces.Camera;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Iphone extends Phone implements Camera {
    private  static final Logger LOGGER = LogManager.getLogger(Samsung.class);
    private String battery;
    public Iphone(String model, int price, double weight, String battery, int phoneNumber) {
        super(model, price, weight, phoneNumber);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iphone i = (Iphone) o;
        return Objects.equals(battery, i.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return super.getModel() + " " + super.getWeight() +" "+ battery;
    }

    @Override
    public void camera() {
        LOGGER.info("It has the best camera!");
    }
}


