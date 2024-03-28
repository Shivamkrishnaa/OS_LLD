package Oops.Abstract;


public class Main {
    public static void main(String[] args) {
        Bird crow = new Crow();
        takeCare(crow);
    }
    static void takeCare(Bird  b) {
        b.breathe();
        b.makeSound();
        b.fly();
    }
}
