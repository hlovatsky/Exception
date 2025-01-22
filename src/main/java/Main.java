import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try (AutoCloseableClass autoCloseableClass = new AutoCloseableClass()) {
            autoCloseableClass.setName("Name");
        } catch (Exception exception) {
            LOGGER.error("Error occurred : {}", exception.getMessage());
            throw new CustomException("Error occurred: " + exception.getMessage());
        }
    }
}