package Projects.tictactoe.strategies.gameWinStategy;

import Projects.tictactoe.models.Board;
import Projects.tictactoe.models.Cell;
import Projects.tictactoe.models.Player;

import java.util.HashMap;

public class OrderOneWinStrategy implements GameWinStrategy{

    HashMap<Character, Integer> columnMap;
    HashMap<Character, Integer> rowMap;
    HashMap<Character, Integer> diagonalMap;
    private int boardDimensions;
    public OrderOneWinStrategy(int boardDimensions){
        this.boardDimensions = boardDimensions;
        this.columnMap = new HashMap<>();
        this.rowMap = new HashMap<>();
        this.diagonalMap = new HashMap<>();
    }
    @Override
    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell){
        columnMap.put(lastPlayedMoveCell.getPlayer().getSymbol(), lastPlayedMoveCell.getColumn());
        return true;
    }
}
