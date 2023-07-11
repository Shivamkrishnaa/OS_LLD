package SOLID_OCP;

public abstract class AlphaBird {
    String name;
    String type;
    public AlphaBird(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void breathe() {
        System.out.println("Bird is breathing");
    }
    public abstract void makeSound();
}
