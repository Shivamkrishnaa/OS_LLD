package Projects.tictactoe.models;

import Projects.tictactoe.Exception.InvalidGameConstructionParameterException;
import Projects.tictactoe.strategies.gameWinStategy.GameWinStrategy;
import Projects.tictactoe.strategies.gameWinStategy.OrderOneWinStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    private Player winner;
    private int nextPlayerIndex;
    private GameWinStrategy gameWinStrategy;
    private Game(){}
    public void undo() {}
    public void makeNextMove(){}
    public void displayBoard(){this.board.display();}

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder {
        private int dimensions;
        private List<Player> players;

        public Builder(){}
        public Builder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        private boolean valid() throws InvalidGameConstructionParameterException {
            if(this.dimensions<3) {
                throw new InvalidGameConstructionParameterException("Dimensions cannot be less than 3");
            }
            if(this.dimensions + 1 != players.size()){
                throw new InvalidGameConstructionParameterException("Number of players must be dimensions + 1");
            }
            Set<Character> playerSymbolSet = new HashSet<>();
            for (int i = 0; i < this.players.size(); i++) {
                char symbol = this.players.get(i).getSymbol();
                if(playerSymbolSet.contains(symbol)){
                    throw new InvalidGameConstructionParameterException("No player can have same symbol");
                } else {
                    playerSymbolSet.add(symbol);
                }
            }
            // validate only one player is bot
            return true;
        }
        public Game build() throws InvalidGameConstructionParameterException{
            try{
                valid();
            } catch (Exception e) {
                throw new InvalidGameConstructionParameterException(e.getMessage());
            }
            Game g =  new Game();
            g.setGameStatus(GameStatus.IN_PROGRESS);
            g.setPlayers(players);
            g.setMoves(new ArrayList<>());
            g.setBoard(new Board(dimensions));
            g.setNextPlayerIndex(0);
            g.setGameWinStrategy(new OrderOneWinStrategy(dimensions));
            return g;
        }

    }




    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameWinStrategy getGameWinStrategy() {
        return gameWinStrategy;
    }

    public void setGameWinStrategy(GameWinStrategy gameWinStrategy) {
        this.gameWinStrategy = gameWinStrategy;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

}
