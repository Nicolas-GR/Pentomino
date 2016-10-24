//This is free, do what you want.
package business;

import data.Square;
import data.FPiece;
import ui.Ui;
import data.Board;

public class Pentomino {
    
    public static void main(String[] args) {
        Ui.printWelcome();
        
        Board tablero = new Board(5,8);
        System.out.println(tablero);
        
        FPiece piezaF = new FPiece();
        System.out.println(piezaF);
        
        
        
        
    }
    
    /*static void imprimeMatriz(String[][] matriz){
        
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col]);
            }
            System.out.println("");

        }
    }*/
    
}
