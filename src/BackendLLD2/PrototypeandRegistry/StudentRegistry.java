package BackendLLD2.PrototypeandRegistry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> students;

    StudentRegistry() {
        students = new HashMap<>();
    }

    public void add(String key , Student student){
        students.put(key, student);
    }

    public void remove(String key){
        students.remove(key);
    }

    public Student get(String key){
        return students.get(key).copy();
    }

    public void fillRegistry(){
        Student apr23Student = new Student("New_St" , 25 , "Apr23");
        Student mar23Student = new Student("New_St" , 25 , "Mar23");
        Student feb23Student = new Student("New_St" , 25 , "Feb23");

        students.put("Apr23Student" , apr23Student);
        students.put("Mar23Student" , mar23Student);
        students.put("Feb23Student" , feb23Student);
    }
}


// Controllers , Services ,  Repositories
// Component