package Polymorphism;

import Polymorphism.Instructor;

public class Client {
    public static void main(String[] args) {
        User u = new User();
        Student s = new Student();
        Instructor instructor = new Instructor();

        User u1 = new Instructor();
        System.out.println(u1.getPassword());
        UserUtility.changePassword(u);
        UserUtility.changePassword(s);
        UserUtility.changePassword(instructor);
    }
}
