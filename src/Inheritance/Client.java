package Inheritance;

public class Client {
    public static void main(String[] args) {
        User u = new User();

//        when child class is Object is created, parent class constructor is also called
        Student st = new Student();
        Instructor i = new Instructor();

        System.out.println("");

        User x1 = new Instructor();
        System.out.println(x1.exam.exam_id);
    }
}
// new Child() => Child () { call the parent constructor from here }
