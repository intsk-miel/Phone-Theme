package patterns.abstractfactory;

public class VehicleTypeFactory extends AbstractFactory{
    @Override
    IVehicleType getVehicleType(String type) {
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Bicycle")){
            return new Bicycle();

        }else if(type.equalsIgnoreCase("Wagon")) {
            return new Wagon();
        }
        return null;
    }

    @Override
    public IVehicle getVehicle (String vehicle){
        return null;
    }
}
