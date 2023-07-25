package Os.AccessModifiers;

public class Student extends User{
    private String name;
    public int roll;
    public Student(String name) {
        super(name);
        this.name = name + "CHILD";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")){
            System.out.println("name cannot be updated");
        } else {
            this.name = name;
        }
    }
}
