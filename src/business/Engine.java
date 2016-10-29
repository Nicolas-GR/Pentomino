package business;

import data.Board;
import data.FPiece;
import data.Piece;
import data.Square;
import ui.Ui;
import java.util.Scanner;

public class Engine {
    
    public static void askMainMenu() {
        Ui.printMainMenu();
        String entry = Ui.getEntry().toString();
        switch (entry) {
            case "1": {
                play();
                break;
            }
            case "2": {
                Ui.printInstructions();
                break;
            }
            case "3": {
                Ui.printCredits();
                break;
            }
            case "4": {
                Ui.printBye();
                break;
            }default:{
                Ui.error();
                break;
            }
        }
        
    }
    
    public static void play() {
        Ui.printBoardMenu();
        
    }
    
    public static void keepGoing() {
        Pentomino.setState(true);
    }
    
    public static void exit() {
        Pentomino.setState(false);
    }
    
    public static Board placePiece(Board board, FPiece piece) {
        Scanner lector = new Scanner(System.in);
        
        Object[][] boardMatrix = board.getBoard();
        
        Square[][] pieceMatrix = piece.getPieceMatrix();
        
        Pentomino.imprimeMatriz(boardMatrix);
        Pentomino.imprimeMatriz(pieceMatrix);
        
        int rowN = lector.nextInt();
        int colN = lector.nextInt();
        
        for (int row = 0; row < pieceMatrix.length; row++) {
            for (int col = 0; col < pieceMatrix[0].length; col++) {
                boardMatrix[row + rowN][col + colN] = pieceMatrix[row][col];
            }
        }
        board = new Board(boardMatrix);
        return board;
    }
}
