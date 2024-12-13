package TicTacToe.controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(
            int size,
            List<Player> players,
            List<WinningStrategy> winningStrategies
    ){
        try {
            return Game
                    .getBuilder()
                    .setSize(size)
                    .setPlayers(players)
                    .setWinningStrategies(winningStrategies)
                    .build();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Sorry. Please try to start the Game again with valid input");
        }
        return null;
    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }

    public void display(Game game){
        game.displayBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){

    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
