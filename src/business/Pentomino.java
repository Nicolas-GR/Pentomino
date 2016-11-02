//This is free, do what you want.
package business;

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
    private static Piece piece;
    
    public static void main(String[] args) {
        Ui.printWelcome();
        
        
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

    public static boolean isStateForBoardMenu() {
        return stateForBoardMenu;
    }

 

    


}

