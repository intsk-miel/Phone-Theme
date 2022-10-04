package patterns.abstractfactory;

public class VehicleFactory extends AbstractFactory {
    @Override
     IVehicle getVehicle(String vehicle){
        if(vehicle == null){
            return null;
        }
        if(vehicle.equalsIgnoreCase("Car")){
            return new Car();

        } else if(vehicle.equalsIgnoreCase("Motorbike")) {
            return new Motorbike();
        }
        return null;
    }

    @Override
    IVehicleType getVehicleType(String type) {
        return null;
    }
}
