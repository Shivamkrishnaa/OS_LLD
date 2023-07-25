package Solid.SOLID_SRP;

public class Client {
    public static void main(String[] args) {
        Bird crow = new Bird("Three eyed raven","Crow");
        Bird pigeon = new Bird("Joye", "Pigeon");
        crow.breathe();
        pigeon.breathe();

        crow.fly();
        pigeon.fly();

        crow.makeSound();
        pigeon.makeSound();
        // 1. We need to add another bird sparrow then we need to modify the existing code of fly adding AND (else if)
        //    is modification.
        //    This doesn't violates open closed principle, as every fn has separate functionality
        AlphaBird alpha_crow = new AlphaBird("Three eyed raven","Crow");
        AlphaBird alpha_pigeon = new AlphaBird("Joye", "Pigeon");
        alpha_crow.breathe();
        alpha_pigeon.breathe();

        alpha_crow.fly();
        alpha_pigeon.fly();

        alpha_crow.makeSound();
        alpha_pigeon.makeSound();
        // 2. we need to add new feature i.e. parrot which also modifies makeSound

    }

}
