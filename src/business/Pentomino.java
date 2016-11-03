//This is free, do what you want.
package business;

import data.Board;
import data.FPiece;
import data.Piece;
import data.Square;
import data.TPiece;
import data.ZPiece;
import java.util.ArrayList;
import ui.Ui;

public class Pentomino {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    
    private static boolean stateForMainMenu = true;
    private static boolean stateForBoardMenu = true;
    private static boolean stateMainPieceMenu = true;
    private static boolean stateOptionPieceMenu = true;
    private static Piece piece;
    public static Board board;
    
    
    public static void main(String[] args) {
        Ui.printWelcome();
        
        start();
        

    }
    
    public static void start(){
        while (stateForMainMenu) {
            Engine.selectOptionInMainMenu();
        }
    }
    
    
    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////

    public static void setStateForMainMenu(boolean stateForMainMenu) {
        Pentomino.stateForMainMenu = stateForMainMenu;
    }

    public static void setStateForBoardMenu(boolean stateForBoardMenu) {
        Pentomino.stateForBoardMenu = stateForBoardMenu;
    }
    
    public static void setStateMainPieceMenu(boolean stateMainPieceMenu) {
        Pentomino.stateMainPieceMenu = stateMainPieceMenu;
    }

    public static boolean isStateMainPieceMenu() {
        return stateMainPieceMenu;
    }
    
    

    public static boolean isStateForBoardMenu() {
        return stateForBoardMenu;
    }

    public static boolean isStateOptionPieceMenu() {
        return stateOptionPieceMenu;
    }

    public static void setStateOptionPieceMenu(boolean stateOptionPieceMenu) {
        Pentomino.stateOptionPieceMenu = stateOptionPieceMenu;
    }

    public static Piece getPiece() {
        return piece;
    }

    public static void setPiece(Piece piece) {
        Pentomino.piece = piece;
    }

    public static Board getBoard() {
        return board;
    }

    public static void setBoard(Board board) {
        Pentomino.board = board;
    }

    
    

    


}

