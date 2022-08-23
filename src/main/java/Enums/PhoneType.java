package Enums;

public enum PhoneType{
    SAMSUNG("Samsung"), IPHONE("Iphone"), NOKIA("Nokia"), HONOR("Honor");
    private final String type;
    PhoneType(String type) {
        this.type=type;
    }
    public String getType() {
        switch(this) {
            case SAMSUNG:
                return "samsung";
            case IPHONE:
                return "iphone";
            case NOKIA:
                return "nokia";
            case HONOR:
                return "honor";
            default:
                return null;
        }
    }
}

