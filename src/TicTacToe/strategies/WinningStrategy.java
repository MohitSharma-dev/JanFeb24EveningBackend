package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
    void handleUndo(Board board , Move move);
}
