package Os.AccessModifiers;

public class User {
    String name;

    public String getFname() {
        return name;
    }

    public void setFname(String fname) {
        this.name = fname;
    }




    public User(String name) {
        this.name = name;
    }

}
