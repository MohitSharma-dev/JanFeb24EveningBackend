package Inheritance;

public class Instructor extends User{
    private String subject;
    private int x = 12;
    Exam exam = new Exam(12);
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    Instructor(){
        System.out.println("Instructor Constructor");
        subject = "Backend";
        exam.exam_id = 14;
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
