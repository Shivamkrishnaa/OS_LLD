package Solid.SOLID_OCP;

public class Flyable_Crow extends Flyable_AlphaBird {

    public Flyable_Crow(String name) {
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
