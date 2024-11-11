package BackendLLD2.Builder;

public class Student {
    private String name;
    private int age;
    private int gradYear;
    private String email;
    private double psp;
    private String university;
    private int jeeRank;

    public Student(StudentBuilder builder){
        if(builder.getAge() < 20){
            throw new IllegalArgumentException("Argument is Invalid");
        }
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.email = builder.getEmail();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
