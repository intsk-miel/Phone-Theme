package patterns.abstractfactory;

public class Car implements IVehicle{
    @Override
    public void makeSound() {
        LOGGER.info("Car is good vehicle");
    }
}
