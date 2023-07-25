package Projects.ticktactoe.strategies.gameWinStategy;

import Projects.ticktactoe.models.Cell;
import Projects.ticktactoe.models.Player;
import Projects.ticktactoe.models.Board;

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
