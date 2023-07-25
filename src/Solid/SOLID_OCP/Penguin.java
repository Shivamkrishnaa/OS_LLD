package Solid.SOLID_OCP;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name, "Penguin");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk squawk");
    }

    @Override
    public void fly() throws Exception {
        throw new Exception("Penguins can't fly");
    }
}
