package Projects.ticktactoe.models;

import java.util.Scanner;

public class Player {
    private String name;
    private int id;
    private PlayerType playerType;
    private char symbol;
    public Player(String name, char symbol, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }
    public Move decideMove(){
        Scanner sc = new Scanner(System.in);
        System.out.println("tell me the next row " + this.name + " ?");
        int row = sc.nextInt();
        System.out.println("tell me the next column " + this.name + " ?");
        int column = sc.nextInt();
        return new Move(this, new Cell(row, column));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

}
