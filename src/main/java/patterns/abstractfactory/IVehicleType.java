package patterns.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IVehicleType {
    static final Logger LOGGER = LogManager.getLogger(IVehicleType.class);
    void vehicleType();
}
