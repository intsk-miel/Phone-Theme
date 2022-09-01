package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SecondThread extends Thread{
    private final static Logger LOGGER = LogManager.getLogger(SecondThread.class);
    @Override
    public void run() {
        LOGGER.info("thread is running...");
    }
}
