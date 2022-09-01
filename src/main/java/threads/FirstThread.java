package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FirstThread implements Runnable{
    private final static Logger LOGGER = LogManager.getLogger(FirstThread.class);
    @Override
    public void run() {
        LOGGER.info("thread is running...");
    }
}