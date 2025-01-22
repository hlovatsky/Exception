import exception.CustomUncheckedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try (AutoCloseableClass autoCloseableClass = new AutoCloseableClass()) {
            autoCloseableClass.writeLog();
        } catch (Exception exception) {
            LOGGER.error("Error occurred : {}", exception.getMessage());
            throw new CustomUncheckedException("Error occurred: " + exception.getMessage());
        }
    }
}