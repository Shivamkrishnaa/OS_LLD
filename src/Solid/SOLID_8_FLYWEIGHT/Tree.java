package Solid.SOLID_8_FLYWEIGHT;

public class Tree {
    String color;
    int height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Tree(String color){
        this.color = color;
        this.height = 6;
    }
}
