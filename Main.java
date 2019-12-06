import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
   private static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
            logger.debug("Hello this is a debug message");
            logger.info("Hello this is an info message");
            logger.warn("Hello this is a warning message");
            logger.error("Hello this is an error message");
            logger.fatal("Hello this is a fatal message");
        PasswordCheck bello = new PasswordCheck();
        bello.passwordIsValid("Bello@10111");
        }
    }

