package Solid.SOLID_SRP;

public class Bird {
    public String name;
    public String type;
    public Bird(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void breathe() {
        System.out.println("Breathe");
    }
    public void makeSound() {
        if (this.type == "Crow") {
            System.out.println("Cow Cow");
        } else if (this.type == "Pigeon") {
            System.out.println("Coo Coo");
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
