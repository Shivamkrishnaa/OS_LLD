package Oops.Interface;

public class Crow implements Bird {
    @Override
    public void makeSound() {
        System.out.println(" make crow sound ");
    }

    @Override
    public void fly() {
        System.out.println("crow flying");
    }
}
