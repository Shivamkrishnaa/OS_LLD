package SOLID_OCP;

public class Peacock extends Bird {

    public Peacock(String name) {
        super(name, "Peacock");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk squawk");
    }

    @Override
    public void fly() {
        System.out.println("Peacock is flying");
    }
}
