package SOLID_8_DECORATOR;

public class Client {
    public static void main(String[] args) {
        Icecream icecream = new StrawberryCone(new ChocoChip(new ChocolateScoop(new VanillaCone())));
        System.out.println("Name: " + icecream.getDescription() + " Cost: " + icecream.getPrice());

    }
}
