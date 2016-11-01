package business;

import data.Board;
import data.Square;
import data.Piece;
import data.FPiece;
import data.IPiece;
import data.LPiece;
import data.NPiece;
import data.PPiece;
import data.TPiece;
import data.UPiece;
import data.VPiece;
import data.WPiece;
import data.XPiece;
import data.YPiece;
import data.ZPiece;
import ui.Ui;
import java.util.ArrayList;
import java.util.Scanner;

public class Engine {
    private static ArrayList<Piece> usedPieces = new ArrayList<Piece>();
    private static Piece piece;
    private static Board board;
    
    public static void askMainMenu() {
        Ui.printMainMenu();
        String entry = Ui.getEntry().toString();
        switch (entry) {
            case "1": {//Jugar
                play();
                break;
            }
            case "2": {//Instrucciones
                Ui.printInstructions();
                break;
            }
            case "3": {//Créditos
                Ui.printCredits();
                break;
            }
            case "4": {//Salir
                Ui.printBye();
                break;
            }
            default: {//Cualquier entrada no válida
                Ui.error();
                break;
            }
        }

    }

    public static Board seclectBoard() {
        String entry = Ui.getEntry().toString();
        Board board = null;
        switch (entry) {//Selecciona un tablero de 5x7
            case "1": {
                board = new Board(5, 7);
                Ui.printBoard(board);
                break;
            }
            case "2": {//Selecciona un tablero de 5x9
                board = new Board(5, 9);
                Ui.printBoard(board);
                break;
            }
            case "3": {//Selecciona un tablero de 5x10
                board = new Board(5, 10);
                Ui.printBoard(board);
            }
            default: {//Cualquier entrada no válida
                Ui.error();
                break;
            }
        }
        return board;
    }

    public static Piece selectPiece() {
        String entry = Ui.getEntry().toString();
        piece = null;
        switch (entry) {
            case "1": {//Seleccion de pieza F
                piece = new FPiece();
                usedPieces.add(piece);
                Ui.printPiece(piece);
                
                break;
            }
            case "2": {//Seleccion de pieza T
                piece = new TPiece();
                usedPieces.add(piece);
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

    public static void askPieceOptions() {

        String entry = Ui.getEntry().toString();

        switch (entry) {
            case "1": {//Ubicar Pieza
                board = placePiece(board, piece);
                Ui.printBoard(board);
                break;
            }
            case "2": {//Re-ubicar Pieza
                Ui.printUsedPieces(usedPieces);
                String entry2 = Ui.getEntry().toString();
                piece = getPieceFromUsedList();
                Ui.printPiece(piece);
                placePiece(board,piece);
                break;
            }
            case "3": {//Rotar
                askRotateOptions(piece);
                Ui.printPiece(piece);
                break;
            }
            case "4": {//Reflejar
                askReflectOptions(piece);
                Ui.printPiece(piece);
                break;
            }
            default: {//Cualquier entrada inválida
                Ui.error();
                break;
            }
        }

    }
    
    public static Piece askReflectOptions(Piece piece) {
        Ui.printReflectOptions();
        String entry = Ui.getEntry().toString();
        Square[][] pieceMatrix = piece.getPieceMatrix();
        
        switch(entry){
            case "1": {//Reflejar Verticalmente
                pieceMatrix = piece.reflectVertical(piece);
                piece.setPieceMatrix(pieceMatrix);
                break;
            }
            case "2": {//Reflejar Horizontalmente
                pieceMatrix = piece.reflectHorizontal(piece);
                piece.setPieceMatrix(pieceMatrix);
                break;
            }
            default: {//Cualquier entrada inválida
                Ui.error();
                break;
            }
        }
        return piece;
    }

    public static Piece askRotateOptions(Piece piece) {
        Ui.printRotateOptions();
        String entry = Ui.getEntry().toString();
        Square[][] pieceMatrix = piece.getPieceMatrix();
        switch (entry) {
            case "1": {//Rotar a la derecha
                pieceMatrix = piece.rotateRight(piece);
                piece.setPieceMatrix(pieceMatrix);
                break;
            }
            case "2": {//Rotar a la Izquierda
                pieceMatrix = piece.rotateLeft(piece);
                piece.setPieceMatrix(pieceMatrix);
                break;
            }
            default: {//Cualquier entrada inválida
                Ui.error();
                break;
            }
        }
        return piece;
    }

    public static Piece getPieceFromUsedList() {

        Piece piece;
        String entry = Ui.getEntry().toString();
        if (isNumeric(entry)) {
            int index = Integer.parseInt(entry);
            piece = usedPieces.get(index);
        } else {
            Ui.error();
            piece = null;
        }
        return piece;
    }

    /* public static ArrayList usedPieces(Piece piece){
        ArrayList <Piece> usedPieces = new ArrayList <Piece>();
        usedPieces.add(piece);
        return usedPieces;
        
    }*/
    public static void play() {
      
        

    }

    public static boolean isNumeric(String entry) {
        try {
            Integer.parseInt(entry);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void keepGoing() {
        Pentomino.setState(true);
    }

    public static void exit() {
        Pentomino.setState(false);
    }

    public static Board placePiece(Board board, Piece piece) {
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
