package BackendLLD2.Decorator.LoggerDecorator;

public class InfoLogDecorator extends LoggerDecorator {
    private Logger logger = null;

    public InfoLogDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String message) {
        logger.log("[INFO] : " + message);
    }
}
