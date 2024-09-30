package Polymorphism;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    User() {
        System.out.println("User constructor is executing");
        this.id = 1;
        this.name = "temp";
        this.email = "temp@gmail.com";
        this.password = "temp";
    }

    public void login() {
        System.out.println("User login is executing");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}