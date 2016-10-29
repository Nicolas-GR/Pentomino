//This is free, do what you want.
package business;

import data.Square;
import data.ZPiece;
import ui.Ui;

public class Pentomino {

    private static boolean state = true;

    public static void main(String[] args) {

        Ui.printWelcome();

        while (state) {
            Engine.askMainMenu();
            
        }
        //Ui.printPieceMenu();

    }

    static void imprimeMatriz(Object[][] matriz) {

        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col]);
            }
            System.out.println("");

        }
    }

    public static void setState(boolean state) {
        Pentomino.state = state;
    }

}
