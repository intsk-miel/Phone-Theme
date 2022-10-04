package patterns.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface IVehicle {
    static final Logger LOGGER = LogManager.getLogger(IVehicle.class);
    void makeSound();
}
