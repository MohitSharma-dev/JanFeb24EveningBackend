package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> grid;
    private int size;

    public Board(int size) {
        this.size = size;
        grid = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            grid.add(new ArrayList<>());
            for(int j = 0; j < size; j++) {
                grid.get(i).add(new Cell(i , j));
            }
        }
    }
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

    public void display(){
        for(List<Cell> row : grid) {
            for(Cell cell : row) {
                cell.displayCell();
            }
            System.out.println();
        }
    }
}


