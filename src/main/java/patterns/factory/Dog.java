package patterns.factory;

public class Dog implements IAnimal{
    @Override
    public void makeSound() {
        LOGGER.info("dog is barking");
    }
}
