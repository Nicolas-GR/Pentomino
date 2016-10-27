package business;

import data.Board;
import data.FPiece;
import data.Piece;
import data.Square;
import ui.Ui;
import java.util.Scanner;

public class Engine {

    public static Board placePiece(Board board, FPiece piece){
        Scanner lector = new Scanner(System.in);
        
        Object[][] boardMatrix = board.getBoard();
        
        Square[][] pieceMatrix = piece.getfMatrix();
        
        Pentomino.imprimeMatriz(boardMatrix);
        Pentomino.imprimeMatriz(pieceMatrix);
        
        int rowN = lector.nextInt();
        int colN = lector.nextInt();
        
        for(int row = 0 ; row < pieceMatrix.length; row++){
            for(int col = 0; col < pieceMatrix[0].length; col++){
                boardMatrix[row+rowN][col+colN] = pieceMatrix[row][col];
            }
        }
        board = new Board(boardMatrix);
        return board;
    }
}
