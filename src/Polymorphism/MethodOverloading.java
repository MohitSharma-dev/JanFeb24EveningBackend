package Polymorphism;

public class MethodOverloading {

    //  register()
    public void register(){
        System.out.println("User register is executing");
    }
//    register ()
//    public String register(){
//        return "";
//    }

    //  register(String)
    public void register(String email){
        System.out.println(email);
    }
    //    register (String , String)
    public void register(String email, String password){
        System.out.println(email + " " + password);
    }
//    register(String , String)
//    public void register (String password , String email){
//
//    }
}
// Method Overloading

// Method signature
//  Name_function (data_type1 , data_Type2 ......)
// return type doesn't bring any change to method signature

