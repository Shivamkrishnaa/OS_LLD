package Oops.Abstract;

public abstract class Bird {
    String type;

    public void breathe() {
        System.out.println("Breathe bird");
    }
    public void fly() {
        System.out.println("Fly bird");
    }
    // all birds make different sound
    public abstract void makeSound();
}
