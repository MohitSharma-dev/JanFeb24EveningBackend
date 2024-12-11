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
        return new Game(
                size,
                players,
                winningStrategies
        );

//        Game.getBuilder().setSize().setPlayers().build();
//        validations will be there
//          1. No of players = size - 1
//          2. All players should have distinct symbols
//          3. We only have at max One Bot
    }

    public GameState getGameState(Game game){
        return GameState.IN_PROGRESS;
    }

    public void display(Game game){
        game.displayBoard();
    }

    public void makeMove(Game game){

    }

    public void undo(Game game){

    }

    public Player getWinner(Game game){
        return null;
    }
}
