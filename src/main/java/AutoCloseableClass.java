import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Data
public class AutoCloseableClass implements AutoCloseable {
    private static final Logger LOGGER = LogManager.getLogger(AutoCloseableClass.class);

    private String name;

    @Override
    public void close() throws CustomException {
        LOGGER.info("Resource has been closed");
    }
}