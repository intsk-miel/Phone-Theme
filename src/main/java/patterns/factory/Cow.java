package patterns.factory;

public class Cow implements IAnimal{
    @Override
    public void makeSound() {
        LOGGER.info("cow is mooing");
    }
}
