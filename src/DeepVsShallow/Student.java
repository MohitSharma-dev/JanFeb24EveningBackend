package DeepVsShallow;

public class Student {
    private int age;
    private int gradYear;
    private Exam enrollmentExam;
    private Batch batch;

    Student(int age, int gradYear) {
        this.age = age;
        this.gradYear = gradYear;
    }

    Student(Student other){
        this.age = other.age;
        this.gradYear = other.gradYear;
//        copying the reference
        this.enrollmentExam = other.enrollmentExam;

//        to create the deep copy, you need to ensure creation of new object
        this.enrollmentExam = new Exam(other.enrollmentExam);
//        shallow copy is used, I want this student in the same batch
//        I should not create a new batch
        this.batch = other.batch;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public Exam getEnrollmentExam() {
        return enrollmentExam;
    }

    public void setEnrollmentExam(Exam enrollmentExam) {
        this.enrollmentExam = enrollmentExam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
}
