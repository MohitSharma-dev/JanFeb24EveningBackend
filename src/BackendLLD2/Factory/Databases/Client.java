package BackendLLD2.Factory.Databases;

import java.util.Scanner;

public class Client {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String dataBase = sc.nextLine();

        Database database =  DBFactory.createDatabase(dataBase);
        UserService userService = new UserService(database);

//        userService.updateUser();

    }
}
