package patterns.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface ISound {
     static final Logger LOGGER = LogManager.getLogger(ISound.class);
     void makeSound();
}
