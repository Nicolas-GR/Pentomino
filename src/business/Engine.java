package business;

import data.Board;
import data.FPiece;
import data.IPiece;
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
                Pentomino.setStateForBoardMenu(true);
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

    public static void selectBoard() {
        Ui.printBoardMenu();
        String entry = Ui.getEntry();
        Board board;
        switch (entry) {
            case "1": {//Tablero de 5x7
                board = new Board(5, 7);
                Pentomino.setBoard(board);
                Ui.printBoard(board);
                //Pentomino.setStateForBoardMenu(false);
                break;
            }
            case "2": {//Tablero de 5x9
                board = new Board(5, 9);
                Pentomino.setBoard(board);
                Ui.printBoard(board);
                //Pentomino.setStateForBoardMenu(false);
                break;
            }
            case "3": {//Tablero de 5x10
                board = new Board(5, 10);
                Pentomino.setBoard(board);
                Ui.printBoard(board);
                //Pentomino.setStateForBoardMenu(false);
                break;
            }
            case "4": {//Salir
                Pentomino.setStateForBoardMenu(false);
                //Pentomino.setStateMainPieceMenu(false);
                Pentomino.setStateOptionPieceMenu(false);
                break;
            }
            default: {//Cualquier entrada inválida
                Ui.error();
                break;
            }
        }
    }

    public static void selectPiece() {
        Ui.printPieceList();
        String entry = Ui.getEntry();
        Piece piece;
        switch (entry) {
            case "1": {//Seleccion de pieza F
                piece = new FPiece();
                Pentomino.setPiece(piece);
                //usedPieces.add(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "2": {//Seleccion de pieza T
                piece = new TPiece();
                Pentomino.setPiece(piece);
                //usedPieces.add(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "3": {//Seleccion de pieza V
                piece = new VPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "4": {//Seleccion de pieza W
                piece = new WPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "5": {//Seleccion de pieza X
                piece = new XPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "6": {//Seleccion de pieza Z
                piece = new ZPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "7": {//Seleccion de pieza L
                piece = new LPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "8": {//Seleccion de pieza Y
                piece = new YPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "9": {//Seleccion de pieza N
                piece = new NPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "10": {//Seleccion de pieza U
                piece = new UPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "11": {//Seleccion de pieza P
                piece = new PPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "12": {//Seleccion de pieza I
                piece = new IPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            default: {//Cualquier entrada inválida.
                Ui.error();
                selectPiece();
                break;
            }
        }

    }

    public static void selectOptionPrincipalPieceMenu() {
        Ui.printPieceMenu();
        String entry = Ui.getEntry();
        switch (entry) {
            case "1": {//Seleccionar Pieza
                selectPiece();
                //Pentomino.setStateMainPieceMenu(false);
                break;
            }
            case "2": {//Reubicar Pieza
                break;
            }
            case "3": {//salir
                System.out.println("Salir");
                Pentomino.setStateMainPieceMenu(false);
                break;
            }
            default: {//Cualquier entrada inválida
                Ui.error();
                break;
            }
        }
    }

    public static void selectActionForPiece() {
        Ui.printPieceOptions();
        String entry = Ui.getEntry();
        switch (entry) {
            case "1": {//Ubicar
                System.out.println("ubicar");
                placePiece(Pentomino.getPiece(), Pentomino.getBoard());
                Pentomino.setStateOptionPieceMenu(false);
                break;
            }
            case "2": {//Rotar
                System.out.println("rotar");
                Pentomino.setStateOptionPieceMenu(false);
                break;
            }
            case "3": {//Reflejar
                System.out.println("reflejar");
                Pentomino.setStateOptionPieceMenu(false);
                break;
            }
            case "4": {//Seleccionar otra pieza
                System.out.println("select another");
                Pentomino.setStateOptionPieceMenu(false);
                break;
            }
            case "5": {//Salir
                Pentomino.setStateOptionPieceMenu(false);
                break;
            }
            default: {
                Ui.error();
                Pentomino.setStateOptionPieceMenu(false);
                break;
            }
        }
    }

    public static void placePiece(Piece Piece, Board board) {
        
    }

    public static void play() {

        while (Pentomino.isStateForBoardMenu()) {

            selectBoard();
            while (Pentomino.isStateMainPieceMenu()) {
                selectOptionPrincipalPieceMenu();
                while (Pentomino.isStateOptionPieceMenu()) {
                    selectActionForPiece();
                }
            }
        }
    }

}
