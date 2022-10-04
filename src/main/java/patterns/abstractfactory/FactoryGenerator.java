package patterns.abstractfactory;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("Vehicle")){
            return new VehicleFactory();

        }else if(factory.equalsIgnoreCase("VehicleType")){
            return new VehicleTypeFactory();
        }
        return null;
    }
}
