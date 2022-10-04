package patterns.abstractfactory;

public class Wagon implements IVehicleType{
    @Override
    public void vehicleType() {
        LOGGER.info("Wagons are fast");
    }
}
