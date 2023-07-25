package Solid.SOLID_8_FLYWEIGHT;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                game.addTree(i, j, "Green");
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                game.addTree(i, j, "Blue");
            }
        }

    }
}
