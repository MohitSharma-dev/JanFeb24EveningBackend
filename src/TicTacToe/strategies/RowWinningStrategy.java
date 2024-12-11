package TicTacToe.strategies;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public void checkWinner() {
        System.out.println("Checking the winner in row");
    }
}
