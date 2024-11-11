package BackendLLD2.Builder;

public class Client {
    private static void doSomething(Student student){
//        student.exam.id;
    }

    public static void main(String[] args) {
//        way 1
//        Student s = new Student(name);
//        Student s = new Student(name , email);
//        Student s = new Student(name , email, age);
//        Student s = new Student(name , email, batch);

//        way 2
//        Student s = new Student();
//        object is not even ready yet
//        and we have supplied the object
//        doSomething(s);
//        s.setAge(24);
//        s.setEmail("abc");
//        s.setName("Mohit");

        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setAge(25);
        studentBuilder.setName("John");
        studentBuilder.setEmail("john@gmail.com");

        Student st = new Student(studentBuilder);
    }
}
