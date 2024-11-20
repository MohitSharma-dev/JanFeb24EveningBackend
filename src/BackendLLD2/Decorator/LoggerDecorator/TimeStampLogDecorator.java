package BackendLLD2.Decorator.LoggerDecorator;

public class TimeStampLogDecorator extends LoggerDecorator {
    private Logger logger;

    public TimeStampLogDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log("[ " + java.time.LocalDateTime.now() + " ] " + message);
    }
}
