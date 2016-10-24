package data;

import java.util.Arrays;

public class Board {

    private int rowDimension;
    private int colDimension;
    private Object board[][];

    public Board(int rowDimension, int colDimension) {
        board = new Object[rowDimension + 2][colDimension + 2];
        String emptySquare = " □□ ";

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (row == 0) {
                    if (col != 0 || col != board[0].length) {
                        board[row][col] = "════";
                    } if (col == 0) {
                        board[row][col] = "╔";
                    } if (col == board[0].length-1) {
                        board[row][col] = "╗";
                    }
                } else if (row == board.length-1) {
                    if (col != 0 || col != board[0].length-1) {
                        board[row][col] = "════";
                    } if (col == 0) {
                        board[row][col] = "╚";
                    } if (col == board[0].length-1) {
                        board[row][col] = "╝";
                    }
                } else if (col == 0) {
                    if (row != 0 || row != board.length-1) {
                        board[row][col] = "║";
                    }
                } else if (col == board[0].length-1) {
                    if (row != 0 || row != board.length-1) {
                        board[row][col] = "║";
                    }
                } else {
                    board[row][col] = emptySquare;
                }
            }
        }

    }

    @Override
    public String toString() {
        String printBoard = "\n";

        for (int row = 0; row < board.length; row++) {
            printBoard = printBoard.concat("");
            for (int col = 0; col < board[0].length; col++) {
                printBoard = printBoard.concat(
                        String.valueOf(board[row][col]).concat(""));
            }
            printBoard = printBoard.concat("\n");
        }
        return printBoard;

    }

}
