package enums;

public enum NumberCameras {
    FEW(2), SEVERAL(4), LOT(7);
    private int cameras;
    NumberCameras(int cameras){
        this.cameras = cameras;
    }
    public int getCameras() {
        return cameras;
    }
}
