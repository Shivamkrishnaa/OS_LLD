package Projects.ticktactoe.models;

import Projects.ticktactoe.strategies.botPlayingStrategy.BotPlayingStrategy;

public class Bot extends Player {
    private BotLevel botLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, char symbol, BotPlayingStrategy botPlayingStrategy, BotLevel botLevel) {
        super(name, symbol, PlayerType.BOT);
        this.botPlayingStrategy = botPlayingStrategy;
        this.botLevel = botLevel;
    }

    public BotLevel getBotLevel() {
        return botLevel;
    }

    public void setBotLevel(BotLevel botLevel) {
        this.botLevel = botLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }
    public Move decideMove() {
        return this.botPlayingStrategy.decideMove(this);
    }
}
