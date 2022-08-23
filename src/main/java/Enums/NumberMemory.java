package Enums;

public enum NumberMemory {
    LOW(16), MEDIUM(128), HIGH(512);
    private int memory;
    NumberMemory(int memory){
        this.memory = memory;
    }
    public int getMemory() {
        return memory;
    }
}
