package theme;

import interfaces.CallType;
import interfaces.Camera;
import interfaces.Voice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Objects;

public class Xiaomi extends Phone implements CallType, Voice, Camera {
    private  static final Logger LOGGER = LogManager.getLogger(Xiaomi.class);
    private static final int phoneNumber = 3432434;
    private String structure;

    public Xiaomi(String model, int price, double weight, String structure) {
        super(model, price, weight, phoneNumber);
        this.structure = structure;
    }

    public String getStructure() {
        return structure;
    }
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Xiaomi xia = (Xiaomi) o;
        return Objects.equals(structure, xia.structure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), structure);
    }

    @Override
    public String toString() {
        return super.getModel() + " " + super.getWeight() +" "+ structure;
    }


    @Override
    public void call() {
        LOGGER.info("Let's call");
    }

    @Override
    public void type() {
        LOGGER.info("He is going to call you");
    }

    @Override
    public void camera() {
        LOGGER.info("you can take a selfie as well");
    }

    @Override
    public void voice() {
        LOGGER.info("Start playing some song");
    }
}


