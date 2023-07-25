package Projects.tictactoe.strategies.botPlayingStrategy;

import Projects.tictactoe.models.Move;
import Projects.tictactoe.models.Player;

public interface BotPlayingStrategy {
    public Move decideMove(Player player);
}
