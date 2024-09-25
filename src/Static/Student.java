package Static;

public class Student {
    private int id;
    private int age;
    private int gradYear;
    public static int countStudents = 0;
    private int count = 0;

    Student(int age, int gradYear) {
        this.count ++;
        countStudents++;
        this.id = countStudents;
        this.age = age;
        this.gradYear = gradYear;
    }

    public int getCountStudents(){
//        in non-static members you can access static
        return countStudents;
    }

    public static void doSomething(){
//        in static methods you can't access non-static members
//        age = 27;
    }
}
