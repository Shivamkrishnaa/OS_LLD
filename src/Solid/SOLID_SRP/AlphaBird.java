package Solid.SOLID_SRP;

public class AlphaBird {
    public String name;
    public String type;
    public AlphaBird(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void breathe() {
        System.out.println("Breathe");
    }
    public void makeCrowSound() {
        System.out.println("Cow Cow");
    }
    public void makePigeonSound() {
        System.out.println("Coo Coo");
    }
    public void makeSound() {
        if (this.type == "Crow") {
            makeCrowSound();
        } else if (this.type == "Pigeon") {
            makePigeonSound();
        }
    }
    public void fly() {
        if (this.type == "Crow") {
            System.out.println("Crow is flying");
        } else if (this.type == "Pigeon") {
            System.out.println("Pigeon is flying");
        }
    }

}
