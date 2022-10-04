package patterns.factory;

public class AnimalFactoryTest {
    public static void main(String args[]){
        AnimalFactory animalFactory = new AnimalFactory();


        IAnimal dog = animalFactory.getAnimal("Dog");
        dog.makeSound();

        IAnimal lion = animalFactory.getAnimal("Lion");
        lion.makeSound();

        IAnimal cat = animalFactory.getAnimal("Cat");
        cat.makeSound();

        IAnimal cow = animalFactory.getAnimal("Cow");
        cow.makeSound();
    }
}
