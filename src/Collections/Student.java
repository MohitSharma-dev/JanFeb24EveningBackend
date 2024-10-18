package Collections;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int gradYear;
    private double psp;
    private double attendance;

    public Student(String name, int age, int gradYear, double psp, double attendance) {
        this.name = name;
        this.age = age;
        this.gradYear = gradYear;
        this.psp = psp;
        this.attendance = attendance;
    }

//    by default I want to sort student object wrt gradYear in asc
    @Override
    public int compareTo(Student other) {
//        -ve , 0 , +ve
//        this to come first in the answer : return -ve
        if(this.gradYear < other.gradYear){
            return -1;
        } else if(this.gradYear > other.gradYear){
            return 1;
        }
//        other to come first in the answer : return +ve
//        equal => 0

        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }
}
// st.compareTo(st2);