//This is free, do what you want.
package business;

import data.Square;
import data.FPiece;
import ui.Ui;
import data.Board;
import data.LPiece;
import data.TPiece;
import data.VPiece;
import data.WPiece;
import data.XPiece;
import data.YPiece;
import data.ZPiece;

public class Pentomino {
    
    public static void main(String[] args) {
        //Ui.printWelcome();
        
        Board tablero = new Board(5,8);
        System.out.println(tablero);
        
        FPiece piezaF = new FPiece();
        System.out.println(piezaF);
        char nameF = piezaF.getName();
        System.out.println(nameF);
        
        TPiece piezaT = new TPiece();
        System.out.println(piezaT);
        char nameT = piezaT.getName();
        System.out.println(nameT);
        
        
        VPiece piezaV = new VPiece();
        System.out.println(piezaV);
        char nameV = piezaV.getName();
        System.out.println(nameV);
        
        WPiece piezaW = new WPiece();
        System.out.println(piezaW);
        char nameW = piezaW.getName();
        System.out.println(nameW);
        
        XPiece piezaX = new XPiece();
        System.out.println(piezaX);
        char nameX = piezaX.getName();
        System.out.println(nameX);
        
        ZPiece piezaZ = new ZPiece();
        System.out.println(piezaZ);
        char nameZ = piezaZ.getName();
        System.out.println(nameZ);
        
        LPiece piezaL = new LPiece();
        System.out.println(piezaL);
        char nameL = piezaL.getName();
        System.out.println(nameL);
        
        YPiece piezaY = new YPiece();
        System.out.println(piezaY);
        char nameY = piezaY.getName();
        System.out.println(nameY);
        
        Square[][] yMatrix = piezaY.getyMatrix();
        
        yMatrix = piezaY.rotateRight(yMatrix);
        piezaY = new YPiece(yMatrix);
        System.out.println(piezaY);
        
       /* 
        Square[][] fMatrix = piezaF.getfMatrix();
        
        fMatrix = piezaF.rotateRight(fMatrix);
        piezaF = new FPiece(fMatrix);
        System.out.println(piezaF);
        
        fMatrix = piezaF.rotateLeft(fMatrix);
        piezaF = new FPiece(fMatrix);
        System.out.println(piezaF);
        
        fMatrix = piezaF.reflectHorizontal(fMatrix);
        piezaF = new FPiece(fMatrix);
        System.out.println(piezaF);
        
        fMatrix = piezaF.reflectHorizontal(fMatrix);
        piezaF = new FPiece(fMatrix);
        System.out.println(piezaF);
        
        fMatrix = piezaF.reflectVertical(fMatrix);
        piezaF = new FPiece(fMatrix);
        System.out.println(piezaF);
        
        
        fMatrix = piezaF.reflectVertical(fMatrix);
        piezaF = new FPiece(fMatrix);
        System.out.println(piezaF);
        */
        
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
