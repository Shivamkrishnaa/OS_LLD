package Oops;

public class Bird {
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void breathe() {
        System.out.println("Bird breathing");
    }
    void makeSound() {
        if(type == "pigeon") System.out.println("Make pigeon sound");
        if(type == "crow") System.out.println("Make crow sound");
    }
}
