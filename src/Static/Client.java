package Static;

public class Client {
    public static void main(String[] args) {

        System.out.println(Student.countStudents);
        Student.doSomething();

//        Math.log(10);

        Student st1 = new Student(24 , 2020);
        Student st2 = new Student(24 , 2020);
        Student st3 = new Student(24 , 2020);
        Student st4 = new Student(24 , 2020);

        System.out.println(Student.countStudents);
        System.out.println();
    }
}
