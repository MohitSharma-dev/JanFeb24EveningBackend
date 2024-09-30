package Inheritance;

public class Student extends User{
    private String course;

    Student(){
        course = "Scaler academy";
//        name = "New_student";
        setName("Mohit");
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void doSomething(){
        super.login();
    }
}
