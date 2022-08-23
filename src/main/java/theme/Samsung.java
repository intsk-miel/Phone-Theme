package theme;

import interfaces.Voice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Samsung extends Phone implements Voice {
    private  static final Logger LOGGER = LogManager.getLogger(Samsung.class);
    private String colour;

    public Samsung(String model, int price, double weight, String colour, int phoneNumber) {
        super(model, price, weight, phoneNumber);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Samsung sam = (Samsung) o;
        return Objects.equals(colour, sam.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour);
    }

    @Override
    public String toString() {
        return super.getModel() + " " + super.getWeight() +" "+ colour;
    }

    @Override
    public void voice() {
        LOGGER.info("turn up the voice!");
    }
}

