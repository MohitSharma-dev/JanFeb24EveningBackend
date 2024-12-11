package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.*;
import TicTacToe.strategies.RowWinningStrategy;
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
        players.add(new HumanPlayer(1 , "Mohit" , new Symbol('X')));
        players.add(new Bot(2 , "Botty", new Symbol('O'), BotDifficultyLevel.EASY));

        int size = 3;

//        Hey User do you want row winning rules ?

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());

        Game game = gameController.startGame(
                size,
                players,
                winningStrategies
        );
        gameController.display(game);
        while(!gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.display(game);
            gameController.makeMove(game);
//            makeMove
//            take the input to make the move
//            update the game state if required
//            update the turn
        }

        if(gameController.getGameState(game).equals(GameState.SUCCESS)){
            System.out.println("Winner: " + gameController.getWinner(game).getName());
        } else if(gameController.getGameState(game).equals(GameState.DRAW)){
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
