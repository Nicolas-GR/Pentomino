package business;

import data.Board;
import data.FPiece;
import data.LPiece;
import data.NPiece;
import data.PPiece;
import data.Piece;
import data.TPiece;
import data.UPiece;
import data.VPiece;
import data.WPiece;
import data.XPiece;
import data.YPiece;
import data.ZPiece;
import ui.Ui;

public class Engine {

    ///////////////////////////////////////////////////////////////////////////
    //Métodos de menús
    ///////////////////////////////////////////////////////////////////////////
    public static void selectOptionInMainMenu() {
        Ui.printMainMenu();
        String entry = Ui.getEntry();
        switch (entry) {
            case "1": {//Jugar
                System.out.println("");
                System.out.println("jugar");
                System.out.println("");
                play();
                break;
            }
            case "2": {//Instrucciones
                Ui.printInstructions();
                break;
            }
            case "3": {//Creditos
                Ui.printCredits();
                break;
            }
            case "4": {//Salir
                Ui.printBye();
                break;
            }
            default: {//Cualquier entrada inválida
                Ui.error();
                //exitFromMainMenu(false);
                break;
            }
        }
    }//Fin del método selectOptionInMainMenu

    public static Board selectBoard() {
        Ui.printBoardMenu();
        String entry = Ui.getEntry();
        Board board = null;
        switch(entry){
            case "1":{//Tablero de 5x7
                board = new Board(5,7);
                Ui.printBoard(board);
                break;
            }
            case "2":{//Tablero de 5x9
                board = new Board(5,9);
                Ui.printBoard(board);
                break;
            }
            case "3":{//Tablero de 5x10
                board = new Board(5,10);
                Ui.printBoard(board);
                break;
            }
            case "4":{//Salir
                exitFromBoardMenu(true);
                break;
            }
            default:{//Cualquier entrada inválida
                Ui.error();
                break;
            }
        }
        return board;
    }
    
    public static Piece selectPiece(){
        Ui.printPieceList();
        String entry = Ui.getEntry().toString();
        Piece piece = null;
        switch (entry) {
            case "1": {//Seleccion de pieza F
                piece = new FPiece();
                //usedPieces.add(piece);
                Ui.printPiece(piece);
                
                break;
            }
            case "2": {//Seleccion de pieza T
                piece = new TPiece();
                //usedPieces.add(piece);
                Ui.printPiece(piece);
                break;
            }
            case "3": {//Seleccion de pieza V
                piece = new VPiece();
                Ui.printPiece(piece);
                break;
            }
            case "4": {//Seleccion de pieza W
                piece = new WPiece();
                Ui.printPiece(piece);
                break;
            }
            case "5": {//Seleccion de pieza X
                piece = new XPiece();
                Ui.printPiece(piece);
                break;
            }
            case "6": {//Seleccion de pieza Z
                piece = new ZPiece();
                Ui.printPiece(piece);
                break;
            }
            case "7": {//Seleccion de pieza L
                piece = new LPiece();
                Ui.printPiece(piece);
                break;
            }
            case "8": {//Seleccion de pieza Y
                piece = new YPiece();
                Ui.printPiece(piece);
                break;
            }
            case "9": {//Seleccion de pieza N
                piece = new NPiece();
                Ui.printPiece(piece);
                break;
            }
            case "10": {//Seleccion de pieza U
                piece = new UPiece();
                Ui.printPiece(piece);
                break;
            }
            case "11": {//Seleccion de pieza P
                piece = new PPiece();
                Ui.printPiece(piece);
                break;
            }
            case "12": {//Seleccion de pieza I
                piece = new IPiece();
                Ui.printPiece(piece);
                break;
            }
            default: {//Cualquier entrada inválida.
                Ui.error();
                break;
            }
        }
        
        return piece;
    }

    public static void play() {
        Board board;
        while (Pentomino.isStateForBoardMenu()) {
            board = selectBoard();
            
        }
    }

    public static void exitFromBoardMenu(boolean state) {
        if (state) {
            Pentomino.setStateForBoardMenu(!state);
        } else {
            Pentomino.setStateForBoardMenu(!state);
        }
    }

    public static void exitFromMainMenu(boolean state) {
        if (state) {
            Pentomino.setStateForMainMenu(!state);
        } else {
            Pentomino.setStateForMainMenu(!state);
        }

    }//Fin del método exitFromMainMenu

    private static class IPiece extends Piece {

        public IPiece() {
        }
    }
}
