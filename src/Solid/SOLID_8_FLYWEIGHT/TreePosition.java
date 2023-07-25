package Solid.SOLID_8_FLYWEIGHT;

public class TreePosition {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    TreePosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
