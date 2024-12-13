package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Integer nextPlayerIndex;
    private GameState gameState;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private Player winner;

//    HW : Clone the project and implement Builder design patter for Game class

    private Game(Integer size, List<Player> players, List<WinningStrategy> winningStrategies) {
        board = new Board(size);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.winner = null;
        this.moves = new ArrayList<>();
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

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void displayBoard(){
        board.display();
    }

    private boolean validateMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()){
            return false;
        }

        return board.getGrid().get(row).get(col).getCellState().equals(CellState.EMPTY);
    }

    private void updateGameState(Move move, Player currentPlayer){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell cellToChange = board.getGrid().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getSymbol());

        move.setCell(cellToChange);
        move.setPlayer(currentPlayer);
        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

//        Mohit Ayush Raman Kavya
    }

    private boolean checkWinner(Move move){
        for(WinningStrategy winningStrategy : winningStrategies){
            if(winningStrategy.checkWinner(board , move)){
                return true;
            }
        }
        return false;
    }

    public void makeMove(){

        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println("It's " + currentPlayer.getName() + "'s turn. Please make your move!");

        Move move =  currentPlayer.makeMove(board);
        if(!validateMove(move)){
            System.out.println("This is invalid Move. Please try again!");
            return;
        }

        updateGameState(move, currentPlayer);

        if(checkWinner(move)){
            winner = currentPlayer;
            gameState = GameState.SUCCESS;
        } else if (moves.size() == board.getSize() * board.getSize()){
            gameState = GameState.DRAW;
        }

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
//         we will write the attributes which we want to take from the user
        private Integer size;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public void validate(){
//            Bot count should be only 1
//            Number of players = size - 1
//            All players should have different symbol
//            Please complete this section

//            Please throw exception if anything is invalid
//            And catch the exceptions within the controller

        }

        public Game build(){
            validate();
            return new Game(
                    size,
                    players,
                    winningStrategies
            );
        }
    }

    public void undo(){
        if(moves.size() == 0){
            System.out.println("There is nothing to Undo!");
            return;
        }

        Move lastMove = moves.get(moves.size() - 1);
        moves.remove(moves.size() - 1);

        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setSymbol(null);
//        (A - B) % N = (A - B + N) % N
        nextPlayerIndex--;
        nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();

        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleUndo(board, lastMove);
        }

        setGameState(GameState.IN_PROGRESS);
        setWinner(null);
    }
}

// Requirement

//  choice of users : which are winning rules they want to have
// row winning rules ?
// col winning rules ?

// checkWinner() {
// }
