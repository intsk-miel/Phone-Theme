package theme;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Battery extends Phone{
    private  static final Logger LOGGER = LogManager.getLogger(Battery.class);
    private int nonremovable;
    private int sizeMah;

    public Battery(){}
    public Battery(String model, int price, double weight, int phoneNumber, int sizeMAh, int nonremovable) {
        super(model, price, weight, phoneNumber);
        this.sizeMah = sizeMAh;
        this.nonremovable = nonremovable;

    }

    public int getNonremovable() {
        return nonremovable;
    }
    public void setNonremovable(int nonremovable) {
        this.nonremovable = nonremovable;
    }

    public int getSizeMah() {
        return sizeMah;
    }
    public void setSizeMah(int sizeMah) {
        this.sizeMah = sizeMah;
    }


    @Override
    public String toString() {
        return super.getModel() + " " + super.getWeight() +" "+ sizeMah;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nonremovable);
    }
}
