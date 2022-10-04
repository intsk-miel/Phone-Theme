package patterns.factory;

public class AnimalFactory {
    public IAnimal getAnimal(String animalType){
        if(animalType == null){
            return null;
        }
        if(animalType.equalsIgnoreCase("Dog")){
            return new Dog();
        } else if(animalType.equalsIgnoreCase("Cat")){
            return new Cat();
        } else if(animalType.equalsIgnoreCase("Cow")){
            return new Cow();
        }  else if(animalType.equalsIgnoreCase("Lion")){
           return new Lion();
        }
        return null;
    }
}
