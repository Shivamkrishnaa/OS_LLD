package Oops.Interface;

public class Pigeon implements Bird {
    @Override
    public void makeSound() {
        System.out.println(" make Pigeon sound ");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon flying");
    }
}
