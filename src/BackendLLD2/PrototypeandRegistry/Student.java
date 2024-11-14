package BackendLLD2.PrototypeandRegistry;

import java.util.ArrayList;
import java.util.List;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;
    private List<Integer> x;

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    Student(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
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

    protected Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.x = new ArrayList<>(st.x);

    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
