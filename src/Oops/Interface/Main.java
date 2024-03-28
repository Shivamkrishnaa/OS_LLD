package Oops.Interface;

public class Main {
    public static void main(String[] args) {
        Bird crow = new Crow();
        Bird pigeon = new Pigeon();
        takeCare(crow);
    }

    static void takeCare(Bird b) {
        b.fly();
        b.makeSound();
    }
}
