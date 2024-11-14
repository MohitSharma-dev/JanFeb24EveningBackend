package BackendLLD2.PrototypeandRegistry;

public class IntelligentStudent extends Student{
    private int iq;

    IntelligentStudent(String name, int age, int iq) {
        super(name, age);
        this.iq = iq;
    }

    private IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
