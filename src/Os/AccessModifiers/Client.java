package Os.AccessModifiers;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("SHIVAM_CC");
        User u = new Student("shivam");
        Student s1 = (Student)new User("siu");


        Cat c = new Cat();
        c.eat();
        Pet p = new Pet();
        p.checkIsGood();
    }
}
