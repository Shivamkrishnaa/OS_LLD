package SOLID_OCP;

public class Crow extends Bird {

    public Crow(String name) {
        super(name, "Crow");
    }

    @Override
    public void makeSound() {
        System.out.println("Cow cow");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
}
