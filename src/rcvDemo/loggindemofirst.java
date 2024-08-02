package rcvDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loggindemofirst {

    // Create a Logger instance for this class
    private static final Logger LOGGER = LogManager.getLogger(loggindemofirst.class);

    public static void main(String[] args) {
        // Log messages of different levels
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warning message");
        LOGGER.error("This is an error message");
        LOGGER.fatal("This is a fatal message");
    }
}
