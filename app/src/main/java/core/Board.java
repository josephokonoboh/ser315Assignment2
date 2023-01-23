package core;


import java.awt.Point;
import java.util.ArrayList;

public class Board {
    public final static int BOARD_SIZE = 8;
    public static enum Direction {
        UP, DOWN
    }

    private Pawn[][] pawns;

    public Board() {
        pawns = new Pawn[BOARD_SIZE][BOARD_SIZE];

        for(int row = 0; row < BOARD_SIZE; ++row) {
            for(int col = 0; col < BOARD_SIZE; ++col) {
                pawns[row][col] = null;
            }
        }
    }

    public void addPawnToBoard(Pawn p, int row, int col) {
        if(!isPositionOpen(row, col)) {
            pawns[row][col] = p;
        }
    }

    public ArrayList<Point> getCaptureList(int row, int col) {
        ArrayList<Point> captureList = null;



        return captureList;
    }    

    public boolean isPositionOpen(int row, int col) {
        if(isPositionValid(row, col)) {
            return pawns[row][col] == null;
        }

        return false;
    }

    public boolean isPositionValid(int row, int col) {
        return 0 <= row && row < BOARD_SIZE &&
               0 <= col && col < BOARD_SIZE;
    }

    public void removePawn(int row, int col) {
        if(isPositionValid(row, col)) {
            pawns[row][col] = null;
        }
    }
}
