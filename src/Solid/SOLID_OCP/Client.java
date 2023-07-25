package Solid.SOLID_OCP;

public class Client {
    public static void someMethod(Bird b) throws Exception {
        b.breathe();
        b.fly();
        b.makeSound();
    }

    public static void someUpgradedMethod(AlphaBird b) throws Exception {
        b.breathe();
        b.makeSound();
    }
    public static void main(String[] args) throws Exception {
        // 1. Bird breathe method is concrete
        // 2. Bird fly and makeSound method is abstract
        //    when we add new bird aka feature peacock makeSound and fly method are modified
        someMethod(new Crow("Three eyed raven"));
        // Easily added new feature without modifying existing functions makeSound and fly
        someMethod(new Peacock("Lord shen"));
        // Adding penguin throws error as penguins cant fly
//        someMethod(new Penguin("Pingu"));


        // Created new Abstract class Flyable bird which extends bird, and crow class extend flyable

        Flyable_AlphaBird f = new Flyable_Crow("Three eyed raven");
        someUpgradedMethod(f);
        f.fly();
        someUpgradedMethod(new NonFlyable_Penguin("Pingu"));

        //              Crow    Penguin     Hummingbird
        // fly          Y         N             Y
        // makeSound    Y         Y             N
        // dance        Y         Y             Y
        // we would need to create 2^3  = 8 abstract cases => (fly, dance, makeSound), (fly, makeSound), (fly) ...
        // 3 behaviours = 8 abstract classes, 10 behaviors = 1024 abstract classes
    }
}
