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

//        StudentBuilder studentBuilder = new StudentBuilder();
        Student student =
                Student.getBuilder()
                    .setAge(25)
                    .setName("John")
                    .setEmail("john@gmail.com")
                    .build();

//        Student st = new Student(new StudentBuilder());
    }
}


