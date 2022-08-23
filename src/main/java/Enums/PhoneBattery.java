package Enums;

public enum PhoneBattery {
    WORST("Lenovo Moto Z-Droid"), MEDIUM("The Samsung Galaxy S6 Active"), BEST("The Samsung Galaxy J7");
    private final String typeBattery;
    PhoneBattery(String type) {
        this.typeBattery = type;
    }
    public String getType() {
        return String.valueOf(typeBattery);
    }
}
