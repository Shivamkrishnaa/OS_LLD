package SOLID_SRP_OCP;

public class Birds {
    String name;
    float weight;
    String color;
    public Birds (String name, float weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    public void breathe() {
        System.out.println("BREATHE->>>>");
    }
}
