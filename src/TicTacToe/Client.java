package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.Bot;
import TicTacToe.models.GameState;
import TicTacToe.models.HumanPlayer;
import TicTacToe.models.Player;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController = new GameController();
//        to start the game , what are the things that are required
//        size of the board
//        List of players
//        winning strategies
        List<Player> players = new ArrayList<>();
        players.add(new HumanPlayer());
        players.add(new Bot());

        int size = 3;

        List<WinningStrategy> winningStrategies = new ArrayList<>();

        gameController.startGame(
                size,
                players,
                winningStrategies
        );

        while(gameController.getGameState().equals(GameState.IN_PROGRESS)){
            gameController.display();
            gameController.makeMove();
//            makeMove
//            take the input to make the move
//            update the game state if required
//            update the turn
        }

        if(gameController.getGameState().equals(GameState.SUCCESS)){
            System.out.println("Winner: " + gameController.getWinner().getName());
        } else if(gameController.getGameState().equals(GameState.DRAW)){
            System.out.println("Game has ended in a draw");
        }
    }
}

// client wants to play the game
// client wants to create players
// the game flow should be happening for here

// display
// ask current player to makeMove
// checkWinner || draw (After making the move if the game state changes then we should stop the game)
//      If yes game over
//      else game continues
