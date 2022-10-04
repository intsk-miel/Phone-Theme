package patterns.factory;

public class Lion implements IAnimal{
    @Override
    public void makeSound() {
        LOGGER.info("lion is roaring");
    }
}
