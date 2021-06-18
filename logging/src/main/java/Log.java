import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private final static Logger LOGGER = LoggerFactory.getLogger(Log.class);

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        LOGGER.info("Info");
        LOGGER.debug("Debug");
        LOGGER.error("Error");
        LOGGER.warn("Warn");
        LOGGER.trace("Trace");
    }
}
