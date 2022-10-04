package patterns.facade;

public class FacadePatternTest {
    public static void main(String args[]){
        SoundFactory soundFactory = new SoundFactory();

        soundFactory.soundWolf();
        soundFactory.soundChicken();
    }
}
