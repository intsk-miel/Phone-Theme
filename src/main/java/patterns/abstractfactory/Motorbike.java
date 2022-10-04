package patterns.abstractfactory;

public class Motorbike implements IVehicle{
    @Override
    public void makeSound() {
        LOGGER.info("Motorbike is better vehicle");
    }
}
