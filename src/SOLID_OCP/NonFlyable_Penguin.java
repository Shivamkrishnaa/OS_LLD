package SOLID_OCP;

public class NonFlyable_Penguin extends NonFlyable_AlphaBird {

    public NonFlyable_Penguin(String name) {
        super(name, "Penguin");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk squawk");
    }

}
