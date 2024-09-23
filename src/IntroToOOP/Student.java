package IntroToOOP;

public class Student {
    public String name;
    public String batch;
//    default
    int gradYear;
    private int age;
    private int salary;

    // name of the constructor is same as class name
    // no return type

    public Student(){
        age = 30;
        batch = "temp Batch";
        gradYear = 2000;
        name = "new Student";
    }

    public void attendClass(){
        System.out.println(name + " Attending class");
    }

    public void setAge(int ageData){
        age = ageData;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        if(salary > 0)
        this.salary = salary;
        else {
            throw new RuntimeException("Invalid salary");
        }
    }
}

// access modifiers
// public : least security , everyone can use it
// protected : within the class, within the package and child class anywhere
// default (package-private) : only accessible within the package
// private : only within the class you can access;



// only nested classes can be private : Builder design pattern
// private Constructor : Singleton design pattern