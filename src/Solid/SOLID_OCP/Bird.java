package Solid.SOLID_OCP;

public abstract class Bird {
    String name;
    String type;
    public Bird(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void breathe() {
        System.out.println("Bird is breathing");
    }
    public abstract void makeSound();
    public abstract void fly() throws Exception;
}
