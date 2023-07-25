package Projects.tictactoe.strategies.gameWinStategy;

import Projects.tictactoe.models.Board;
import Projects.tictactoe.models.Cell;
import Projects.tictactoe.models.Player;

public interface GameWinStrategy {
    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell);
}
