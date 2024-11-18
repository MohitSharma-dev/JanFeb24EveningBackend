package BackendLLD2.Builder;

public class Student {
    private String name;
    private int age;
    private int gradYear;
    private String email;
    private double psp;
    private String university;
    private int jeeRank;

    private Student(StudentBuilder builder){
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

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        //    we can add all the attributes here which we want to at creation of the object
        private String name;
        private int age;
        private int gradYear;
        private String email;
        private double psp;
        private String university;
        private int jeeRank;

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public StudentBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public void validate(){
            if(age < 20){
                throw new IllegalArgumentException("Argument is Invalid");
            }
//        further validations
        }

        public Student build(){
            validate();
            return new Student(this);
        }
    }

}
