package Generics;

import java.util.List;

public class UserUtility {
    public static void printUserNames(List< ? extends User> users){
        for(User user : users){
            System.out.println(user.getName());
        }
    }

    public static <T extends User> T printUserEmails(List< T > users, T user){
        for(User u : users){
            System.out.println(u.getName());
        }
        return user;
    }
}
