import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AutoCloseableClass implements AutoCloseable {
    private static final Logger LOGGER = LogManager.getLogger(AutoCloseableClass.class);

    @Override
    public void close() {
        LOGGER.info("Resource has been closed");
    }

    public void writeLog() {
        LOGGER.info("Log for AutoCloseableClass");
    }
}