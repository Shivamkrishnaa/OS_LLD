package Projects.ticktactoe.strategies.gameWinStategy;

import Projects.ticktactoe.models.Cell;
import Projects.ticktactoe.models.Player;
import Projects.ticktactoe.models.Board;

public interface GameWinStrategy {
    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell);
}
