package patterns.abstractfactory;

public class Bicycle implements IVehicleType{
    @Override
    public void vehicleType() {
        LOGGER.info("Bicycle is the best type of transportation");
    }
}
