package BackendLLD2.Decorator.LoggerDecorator;

import java.io.*;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        BasicLogger basicLogger = new BasicLogger();
        basicLogger.log("Some basic message");

        Logger logger = new BasicLogger();

        logger =  new TimeStampLogDecorator(logger);
        logger =  new InfoLogDecorator(logger);
        logger.log("Some stamp message");

        InputStream inputStream = new FileInputStream("example.text");
        inputStream = new BufferedInputStream(inputStream);
    }
}
