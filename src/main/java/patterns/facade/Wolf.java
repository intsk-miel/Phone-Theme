package patterns.facade;

public class Wolf implements ISound {
    @Override
    public void makeSound() {
        LOGGER.info("Wold is kind of ow-ww");
    }
}
