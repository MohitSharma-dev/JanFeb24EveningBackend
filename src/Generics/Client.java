package Generics;

import Polymorphism.MethodOverriding.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        Pair p = new Pair();
        p.first = "Mohit";
        p.second = "Sharma";

        p.first = 32.0;
//        String p1 = (String) p.first;

        GenericPair<String, Integer> pair2 = new GenericPair<>();
        pair2.first = "Mohit";
        pair2.second = 42;

        GenericPair<Double, Double> pair3 = new GenericPair<>();
        pair3.first = null;
        pair3.second = 42.0;

        GenericPair<String, Pair> pair4 = new GenericPair<>();

//        Raw types : Raw use of parametrised class
//        This is supported because of Backward Compatability
        GenericPair gp = new GenericPair();
        HashMap hm = new HashMap();
//        automatically take Object
        String x =  GenericPair.doSomething("Mohit");

        double y = GenericPair.doSomething(42.0);
        System.out.println(pair4.toString());

        List<User> users = new ArrayList<User>();
        Instructor instructor = new Instructor();
        instructor.setName("Mohit");
        Student student = new Student();
        student.setName("Zarana");
        users.add(instructor);
        users.add(student);

        List<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor);
        UserUtility.printUserNames(instructors);

        User temp = new Instructor();


    }
}

// double : Double
// Wrappers , AutoBoxing