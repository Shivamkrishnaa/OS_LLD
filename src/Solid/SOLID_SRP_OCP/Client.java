package Solid.SOLID_SRP_OCP;

public class Client {
    public static void main(String[] args) {
        Crow c = new Crow("Three eyed crow",100,"BLACK");
        c.fly();
        c.breathe();
    }

}
