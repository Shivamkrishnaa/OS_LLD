package Projects.ticktactoe.strategies.botPlayingStrategy;

import Projects.ticktactoe.models.Player;
import Projects.ticktactoe.models.Move;

public interface BotPlayingStrategy {
    public Move decideMove(Player player);
}
