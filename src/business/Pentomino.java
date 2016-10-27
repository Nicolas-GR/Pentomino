//This is free, do what you want.
package business;

import data.Square;
import data.ZPiece;

public class Pentomino {

    public static void main(String[] args) {
        //Ui.printWelcome();

        //Ui.printPieceMenu();
        ZPiece piezaZ = new ZPiece();
        System.out.println(piezaZ);
        char nameZ = piezaZ.getName();
        System.out.println(nameZ);
   
        
        Square[][] matrix = piezaZ.rotateRight(piezaZ);
        
        imprimeMatriz(matrix);
        
        /*
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

        NPiece piezaN = new NPiece();
        System.out.print(piezaN);
        char nameN = piezaN.getName();
        System.out.println(nameN);

        UPiece piezaU = new UPiece();
        System.out.println(piezaU);
        char nameU = piezaU.getName();
        System.out.println(nameU);

        PPiece piezaP = new PPiece();
        System.out.println(piezaP);
        char nameP = piezaP.getName();
        System.out.println(nameP);

        IPiece piezaI = new IPiece();
        System.out.println(piezaI);
        char nameI = piezaI.getName();
        System.out.println(nameI);

        Square[][] iMatrix = piezaI.getiMatrix();

        iMatrix = piezaI.rotateRight(iMatrix);
        piezaI = new IPiece(iMatrix);
        System.out.println(piezaI);
        
        */

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

    static void imprimeMatriz(Object[][] matriz){
        
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col]);
            }
            System.out.println("");

        }
    }
}
