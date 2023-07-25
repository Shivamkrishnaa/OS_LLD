package Solid.SOLID_OCP;

public abstract class Flyable_AlphaBird extends AlphaBird {

    public Flyable_AlphaBird(String name, String type) {
        super(name, type);
    }

    public abstract void fly();
}
