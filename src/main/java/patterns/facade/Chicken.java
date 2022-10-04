package patterns.facade;

public class Chicken implements ISound{
    @Override
    public void makeSound() {
        LOGGER.info("Chicken is clucking");
    }
}
