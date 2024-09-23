package AccessModifiers;

import IntroToOOP.Student;

public class Client {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Mohit";
        s.batch = "Jan24";
        // age is private
//        s.age = 25;
//        gradYear is default
//        s.gradYear = 2024;
    }
}
