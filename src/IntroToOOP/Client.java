package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Mohit";
        s.batch = "Jun24";
        s.gradYear = 2020;
        s.attendClass();

//        age has private access
//        s.age = 25;
        s.setAge(30);
        int age = s.getAge();

        s.setSalary(-10000);

        Student t = new Student();
        t.name = "Mohit";
        t.gradYear = 2025;
        t.attendClass();

//        copy of the reference will be created
        t = s;
        System.out.println(t.gradYear);
    }
}
