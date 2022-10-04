package patterns.abstractfactory;

public abstract class AbstractFactory {
    abstract IVehicle getVehicle(String vehicle);
    abstract IVehicleType getVehicleType(String type);
}
