package data;

import java.util.Arrays;

public class Board {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    
    private int rowDimension;
    private int colDimension;
    private Square board[][];

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    
    public Board(int rowDimension, int colDimension) {
        
        this.setColDimension(colDimension);
        this.setRowDimension(rowDimension);
        
        board = new Square[rowDimension + 2][colDimension + 2];
        Square emptySquare = new Square(0 ,0 ,"□");

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (row == 0) {
                    if (col != 0 || col != board[0].length) {
                        Square square = new Square(row, col, "═");
                        board[row][col] = square;
                    }
                    if (col == 0) {
                        Square square = new Square(row, col, "╔");
                        board[row][col] = square;
                    }
                    if (col == board[0].length - 1) {
                        Square square = new Square(row, col, "╗");
                        board[row][col] = square;
                    }
                } else if (row == board.length - 1) {
                    if (col != 0 || col != board[0].length - 1) {
                        Square square = new Square(row, col, "═");
                        board[row][col] = square;
                    }
                    if (col == 0) {
                        Square square = new Square(row, col, "╚");
                        board[row][col] = square;
                    }
                    if (col == board[0].length - 1) {
                        Square square = new Square(row, col, "╝");
                        board[row][col] = square;
                    }
                } else if (col == 0) {
                    if (row != 0 || row != board.length - 1) {
                        Square square = new Square(row, col, "║");
                        board[row][col] = square;
                    }
                } else if (col == board[0].length - 1) {
                    if (row != 0 || row != board.length - 1) {
                        Square square = new Square(row, col, "║");
                        board[row][col] = square;
                    }
                } else {
                    board[row][col] = emptySquare;
                }
            }
        }

    }

    public Board(Square[][] board) {
        this.board = board;
    }
    
    


    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////    
    
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
    
    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////

    public int getRowDimension() {
        return rowDimension;
    }

    public int getColDimension() {
        return colDimension;
    }

    public void setRowDimension(int rowDimension) {
        this.rowDimension = rowDimension;
    }

    public void setColDimension(int colDimension) {
        this.colDimension = colDimension;
    }
    
    

    
    
    
    public Square[][] getBoard() {
        return board;
    }

    public void setBoard(Square[][] board) {
        this.board = board;
    }
    

}
