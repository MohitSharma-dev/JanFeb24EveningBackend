package ExceptionHandling;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.HashMap;

public class Student {
    private HashMap<Integer, String> students;

    static {
        dodo();
    }
    Student(){
        students = new HashMap<>();
        students.put(1 , "Mohit");
    }
    public static int doSomething(int x){
        return 1 / x;
//        Unchecked Exception :
//        NullPointerException
//        IndexOutOfBoundsException
//        checked Exception :
//        FileNotFoundException
//        SQLException
    }

    public void checkExceptions(int x) throws SQLException, FileNotFoundException {
        if(x % 2 == 0){
//            unchecked
            throw new IllegalArgumentException();
        } else if (x % 3 == 0){
//            checked
            throw new SQLException();
        } else if (x % 5 == 0){
            throw new FileNotFoundException();
        }
    }

    public void findUserById(int id) throws UserNotFoundException {
        if(students.containsKey(id)){
            System.out.println(students.get(id));
        } else {
            throw new UserNotFoundException("User Not found exception");
        }
    }

    public void doSomeBlast(int x){
        doSomeBlast(x * x);
    }

    public static void dodo(){
        throw new RuntimeException("temp");
    }
}
