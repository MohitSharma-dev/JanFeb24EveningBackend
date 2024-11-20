package BackendLLD2.Decorator.LoggerDecorator;

public abstract class Logger {
    public void log(String message){
        System.out.println(message);
    }
}


// basic Logger

// timestamp
// [INFO] , [ERROR]
//