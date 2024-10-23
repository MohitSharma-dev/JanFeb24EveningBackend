package ExceptionHandling;

// un-checked Exception
public class UserNotFoundException extends Exception {

    UserNotFoundException(String message) {
        super(message);
    }
}
