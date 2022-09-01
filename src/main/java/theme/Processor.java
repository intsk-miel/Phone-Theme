package theme;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Processor extends Phone{
    private  static final Logger LOGGER = LogManager.getLogger(Processor.class);
    private String graphicMemory;
    private String chipset;
    private String operatingSystem;


    public Processor(String model, int price, double weight, int phoneNumber, String graphicMemory, String chipset, String operatingSystem) {
        super(model, price, weight, phoneNumber);
        this.graphicMemory = graphicMemory;
        this.chipset = chipset;
        this.operatingSystem = operatingSystem;
    }

    public String getGraphicMemory() {
        return graphicMemory;
    }

    public void setGraphicMemory(String graphicMemory) {
        this.graphicMemory = graphicMemory;
    }


    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return super.getModel() + " " + super.getWeight() +" "+ chipset + operatingSystem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), graphicMemory);
    }
}
