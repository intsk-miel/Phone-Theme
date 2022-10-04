package patterns.facade;

public class SoundFactory {
    private ISound wolf;
    private ISound chicken;

    public SoundFactory() {
        wolf = new Wolf();
        chicken = new Chicken();
    }

    public void soundWolf(){
        wolf.makeSound();
    }
    public void soundChicken(){
        chicken.makeSound();
    }
}
