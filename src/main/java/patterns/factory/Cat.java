package patterns.factory;

public class Cat implements IAnimal{
    @Override
    public void makeSound() {
        LOGGER.info("cat is meowing");
    }
}
