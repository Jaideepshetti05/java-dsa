import java.time.LocalDateTime;

class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " : " + message);
    }
}

public class SimpleLogger {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();

        logger.log("Application Started");
        logger.log("User Logged In");
        logger.log("Application Closed");
    }
}