package BackendLLD2.Decorator.LoggerDecorator;

public class ErrorLogDecorator extends LoggerDecorator {
    private BasicLogger basicLogger;

    public ErrorLogDecorator(BasicLogger basicLogger) {
        this.basicLogger = basicLogger;
    }
    @Override
    public void log(String message) {
        basicLogger.log("[ERROR ] : " + message);
    }
}
