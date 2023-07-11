package SOLID_SRP_OCP;

public class Crow extends Birds implements Flyable {
    public Crow(String name, float weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void fly() {
        System.out.println("FLYTING CROW");
    }
}
