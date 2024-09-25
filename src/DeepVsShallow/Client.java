package DeepVsShallow;

public class Client {
    public static void main(String[] args) {

        Student st = new Student(25 , 2020);
        Exam exam = new Exam(1 , 95);
        st.setEnrollmentExam(exam);

        Batch b = new Batch("Apr23");
        st.setBatch(b);

        Student st2 = new Student(st);

        st2.setAge(27);
        st2.getEnrollmentExam().setScore(35);
        Batch b1 = new Batch("May23");
        st2.setBatch(b1);
        System.out.println("");


    }
}

// ref1 = ref2 => only addresses are being , effectively same object
// ref1 = ref3