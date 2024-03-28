package Oops;

public class Main {
    public static void main(String[] args) {
        Bird crow = new Bird();
        crow.setType("crow");
        takeCare(crow);

        Bird pigeon = new Bird();
        pigeon.setType("pigeon");
        takeCare(pigeon);
    }
    static void takeCare(Bird b) {
        b.breathe();
        b.makeSound();
    }
}
