package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Client {
    public static void main(String[] args)  throws IOException {
        Student.doSomething(5);

        Student x = new Student();
        try {
            x.checkExceptions(15);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            x.checkExceptions(15);
        } catch (SQLException | FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            x.checkExceptions(15);
        } catch (Exception e){
            System.out.println(e.getMessage());
//            System.out.println(Arrays.toString(e.getStackTrace()));
//            e.printStackTrace();
        } // catch (SQLException e){
           // System.out.println(e.getMessage());
        //}

//        A -> B -> C -> D
//        catch in this order : A -> B -> C -> D

       try {
           x.findUserById(1);
           x.findUserById(2);
       } catch (UserNotFoundException e){
           System.out.println(e.getMessage());
           throw new IOException(e);
       } finally {
//           close the db connectio
           System.out.println("Database connection is closed");
       }

        System.out.println("WE are outside the try catch");

//        x.doSomeBlast(5);

    }
}

// checked Exceptions
// throw it further , you should inform via throws
//      OR
// handle it / catch it