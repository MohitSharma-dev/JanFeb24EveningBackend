package BackendLLD2.PrototypeandRegistry;

public class Client {
    public static void main(String[] args) {
        Student st = new Student("Mohit" , 25 , "Dummy batch");

//        copying the references
//        Student st2 = st;
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.fillRegistry();

        Student st1 = studentRegistry.get("Apr23Student");
        st1.setName("Mohit Sharma");

    }
}
