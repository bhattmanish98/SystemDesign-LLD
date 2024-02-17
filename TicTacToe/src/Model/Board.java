package Model;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
        if (row < 0 || row >= size || column < 0 || column >= size) return false;
        if(board[row][column] != null) return false;
        board[row][column] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> emptySpaces = new ArrayList<>();
        for(int i=0;i<size;i++) for(int j=0;j<size;j++) if (board[i][j] == null) emptySpaces.add(new Pair<>(i,j));
        return emptySpaces;
    }

    public void printBoard() {
        for (int i = 0; i< size;i++) {
            for (int j = 0 ; j< size;j++) {
                System.out.print((board[i][j] == null ? " " : board[i][j].type) + "|");
            }
            System.out.println();
        }
    }
}
