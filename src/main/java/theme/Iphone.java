package theme;

import json.interfaces.ICamera;
import json.interfaces.IFingerPrint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Iphone extends Phone implements ICamera, IFingerPrint {
    private  static final Logger LOGGER = LogManager.getLogger(Samsung.class);
    private double size;
    public Iphone(String model, int price, double weight, double size , int phoneNumber) {
        super(model, price, weight, phoneNumber);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iphone i = (Iphone) o;
        return Objects.equals(size, i.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return super.getModel() + " " + super.getWeight() +" "+ size;
    }

    @Override
    public void camera() {
        LOGGER.info("It has the best camera!");
    }


    @Override
    public void ultrasonic() {
        LOGGER.info("Iphone is planning to use that type of fingerprint");
    }

    @Override
    public void capacitive() {
        LOGGER.info("Iphone has advanced capacitive touch ");
    }

    @Override
    public void optical() {
        LOGGER.info("Iphone 13 could have gotten optical fingerprint");
    }
}


