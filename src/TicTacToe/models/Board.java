package TicTacToe.models;

import java.util.List;

public class Board {
    private List<List<Cell>> grid;
    private int size;

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
