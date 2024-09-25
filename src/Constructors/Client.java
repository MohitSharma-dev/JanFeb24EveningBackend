package Constructors;

public class Client {
    public static void main(String[] args) {
        Student s = new Student(32 , 2025);
        s.setAge(35);
        System.out.println(s.getGradYear());

        Student s1 = new Student();
        s1.setAge(32);
        s1.setGradYear(2027);

//        this will create the copy of reference
//        Student s2 = s1;
        Student s2 = new Student();
        s2.setAge(s1.getAge());
        s2.setGradYear(s1.getGradYear());
        s2.setName(s1.getName());
        Student s3 = new Student(s2);
    }
}
// Java will provide default constructor if and only if there is no constructor defined in the class
// Student : email , password