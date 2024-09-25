package Constructors;

public class Student {
    private int age;
    private int gradYear;
    private String name;
    // C1
    Student(){
        age = 25;
        gradYear = 2020;
    }


//     this : current Object
    // C2
    Student(int age, int gradYear){
        this.age = age;
        this.gradYear = gradYear;
    }

    Student(Student other){
        this.age = other.age;
        this.gradYear = other.gradYear;
        this.name = other.name;
    }

//    Student(int gradYear , int age){
//
//    }
//
//  C3
    Student(int age, String message){
        this.age = age;
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
//    "this" will be referring to the Object which is calling the function
    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
