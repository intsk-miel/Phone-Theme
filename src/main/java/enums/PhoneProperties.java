package enums;

public enum PhoneProperties {
    FIRSTPHONE(PhoneType.SAMSUNG, PhoneBattery.MEDIUM, NumberCameras.FEW.getCameras(), NumberMemory.MEDIUM.getMemory()),
    SECONDPHONE(PhoneType.IPHONE,  PhoneBattery.BEST, NumberCameras.FEW.getCameras(), NumberMemory.HIGH.getMemory()),
    THIRDPHONE(PhoneType.NOKIA,  PhoneBattery.MEDIUM, NumberCameras.LOT.getCameras(), NumberMemory.LOW.getMemory()),
    FOURTHPHONE(PhoneType.HONOR,  PhoneBattery.WORST, NumberCameras.SEVERAL.getCameras(), NumberMemory.MEDIUM.getMemory());

    private final PhoneType type;
    private final PhoneBattery typeBattery;
    private int numberCameras;
    private int numberMemory;

    PhoneProperties(PhoneType type, PhoneBattery typeBattery, int numberCameras, int numberMemory) {
        this.type = type;
        this.typeBattery = typeBattery;
        this.numberCameras =  numberCameras;
        this.numberMemory = numberMemory;
    }

    public PhoneType getType() {
        return type;
    }

    public PhoneBattery getTypeBattery() {
        return typeBattery;
    }


    public int getNumberCameras() {
        return numberCameras;
    }

    public void setNumberCameras(int numberCameras) {
        this.numberCameras = numberCameras;
    }

    public int getNumberMemory() {
        return numberMemory;
    }

    public void setNumberMemory(int numberMemory) {
        this.numberMemory = numberMemory;
    }
}
