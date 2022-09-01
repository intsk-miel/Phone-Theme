package streaming;

public class Phone {
    private String model;
    private int price;
    private double batteryCapacity;
    private PhoneType phoneType;
    private OperatingSystem systemType;


    public Phone(String model, int price, double batteryCapacity, PhoneType phoneType, OperatingSystem systemType) {
        this.model = model;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.phoneType = phoneType;
        this.systemType = systemType;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }
    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public OperatingSystem getSystemType() {
        return systemType;
    }
    public void setSystemType(OperatingSystem systemType) {
        this.systemType = systemType;
    }

    @Override
    public String toString() {
        return getModel() + " " + getPrice() +" "+ getBatteryCapacity()  +" "+ getPhoneType()  +" "+  getSystemType();
    }
}
