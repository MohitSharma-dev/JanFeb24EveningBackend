package Inheritance;

public class Instructor extends User{
    private String subject;

    Instructor(){
        System.out.println("Instructor Constructor");
        subject = "Backend";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

//              User (id , name, email ,password)
//    Student(course)           Instructor(subject)
