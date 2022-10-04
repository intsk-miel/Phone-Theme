package patterns.abstractfactory;

public class AbstractFactoryPatternTest {
    public static void main(String[] args){
        AbstractFactory vehicleFactory = FactoryGenerator.getFactory("Vehicle");

        IVehicle car = vehicleFactory.getVehicle("Car");
        car.makeSound();

        IVehicle motorbike = vehicleFactory.getVehicle("Motorbike");
        motorbike.makeSound();


        AbstractFactory vehicleTypeFactory = FactoryGenerator.getFactory("Vehicle Type");

        IVehicleType bicycle = vehicleTypeFactory.getVehicleType("Bicycle");
        bicycle.vehicleType();

        IVehicleType wagon = vehicleTypeFactory.getVehicleType("Wagon");
        wagon.vehicleType();
    }
}
