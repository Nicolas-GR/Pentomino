package business;

import data.Board;
import data.FPiece;
import data.IPiece;
import data.LPiece;
import data.NPiece;
import data.PPiece;
import data.Piece;
import data.Square;
import data.TPiece;
import data.UPiece;
import data.VPiece;
import data.WPiece;
import data.XPiece;
import data.YPiece;
import data.ZPiece;
import java.util.ArrayList;
import ui.Ui;

public class Engine {

    public static ArrayList<String> usedIndex = new ArrayList<String>();
    public static ArrayList<Piece> usedPieces = new ArrayList<Piece>();

    ///////////////////////////////////////////////////////////////////////////
    //Métodos de menús
    ///////////////////////////////////////////////////////////////////////////
    public static void selectOptionInMainMenu() {
        Ui.printMainMenu();
        String entry = Ui.getEntry();
        switch (entry) {
            case "1": {//Jugar
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
                break;
            }
        }
    }//Fin del método selectOptionInMainMenu

    public static void selectBoard() {
        Ui.printBoardMenu();
        usedPieces.removeAll(usedPieces);
        String entry = Ui.getEntry();
        Board board;
        switch (entry) {
            case "1": {//Tablero de 5x7
                board = new Board(5, 5);
                Pentomino.setBoard(board);
                Ui.printBoard(board);
                break;
            }
            case "2": {//Tablero de 5x9
                board = new Board(5, 9);
                Pentomino.setBoard(board);
                Ui.printBoard(board);
                break;
            }
            case "3": {//Tablero de 5x10
                board = new Board(5, 10);
                Pentomino.setBoard(board);
                Ui.printBoard(board);
                break;
            }
            case "4": {//Salir
                Pentomino.setStateForBoardMenu(false);
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

        usedIndex.add(entry);
        Piece piece = null;

        //Piece piece;
        switch (entry) {
            case "1": {//Seleccion de pieza F
                piece = new FPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "2": {//Seleccion de pieza T
                piece = new TPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "3": {//Seleccion de pieza V
                piece = new VPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "4": {//Seleccion de pieza W
                piece = new WPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "5": {//Seleccion de pieza X
                piece = new XPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "6": {//Seleccion de pieza Z
                piece = new ZPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "7": {//Seleccion de pieza L
                piece = new LPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "8": {//Seleccion de pieza Y
                piece = new YPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "9": {//Seleccion de pieza N
                piece = new NPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "10": {//Seleccion de pieza U
                piece = new UPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "11": {//Seleccion de pieza P
                piece = new PPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            case "12": {//Seleccion de pieza I
                piece = new IPiece();
                Pentomino.setPiece(piece);
                Ui.printPiece(piece);
                break;
            }
            default: {//Cualquier entrada inválida.
                Ui.error();
                selectPiece();
                break;
            }
        }

        if (containsPiece(usedPieces, Pentomino.getPiece())) {
            Ui.error();
            Pentomino.setStateOptionPieceMenu(false);
        } else {
            usedPieces.add(piece);
            Pentomino.setStateOptionPieceMenu(true);
        }
    }

    public static void selectOptionPrincipalPieceMenu() {
        Ui.printPieceMenu();
        String entry = Ui.getEntry();
        switch (entry) {
            case "1": {//Seleccionar Pieza
                Ui.printList(usedPieces);
                selectPiece();
                break;
            }
            case "2": {//Reubicar Pieza
                System.out.println("Reubicar");
                Ui.printUsedPieces(usedPieces);
                getUsedPiece(usedPieces);
                replacePiece(Pentomino.getPiece(), Pentomino.getBoard());
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
                placePiece(Pentomino.getPiece(), Pentomino.getBoard());
                Pentomino.setStateOptionPieceMenu(false);
                break;
            }
            case "2": {//Rotar
                rotatePiece(Pentomino.getPiece());
                break;
            }
            case "3": {//Reflejar
                reflectPiece(Pentomino.getPiece());
                break;
            }
            case "4": {//Seleccionar otra pieza
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

    public static void placePiece(Piece piece, Board board) {

        Square[][] boardMatrix = (Square[][]) board.getBoard();
        Square[][] pieceMatrix = piece.getPieceMatrix();

        Ui.printBoard(board);
        Ui.printPiece(piece);
        int[] rowCol = Ui.getRowAndCol();
        int rowN = rowCol[0];
        int colN = rowCol[1];
        Square squarePiece;
        Square squareBoard;

        for (int row = 0; row < pieceMatrix.length; row++) {

            for (int col = 0; col < pieceMatrix[0].length; col++) {
                squarePiece = pieceMatrix[row][col];
                squareBoard = boardMatrix[row + rowN][col + colN];

                if (squarePiece.getValue().equals(" ")) {
                    squarePiece.setValue("□");
                    pieceMatrix[row][col] = squarePiece;
                }
                if (squarePiece.getValue().equals("□") && squareBoard.getValue().equals("□")) {
                    squareBoard = new Square(row + rowN, col + colN, "□");
                    boardMatrix[row + rowN][col + colN] = squareBoard;
                } else if (squarePiece.getValue().equals("□") && !squareBoard.getValue().equals("□")) {
                    squareBoard = new Square(row + rowN, col + colN, squareBoard.getValue());
                    boardMatrix[row + rowN][col + colN] = squareBoard;
                } else if (!squarePiece.getValue().equals("□") && squareBoard.getValue().equals("□")) {
                    squareBoard = new Square(row + rowN, col + colN, squarePiece.getValue());
                    boardMatrix[row + rowN][col + colN] = squareBoard;
                } else if (!squarePiece.getValue().equals("□") && !squareBoard.getValue().equals("□")) {
                    squareBoard = new Square(row + rowN, col + colN, squareBoard.getValue());
                    boardMatrix[row + rowN][col + colN] = squareBoard;
                    cleanBoard(piece, board);
                    row = pieceMatrix.length;
                    col = pieceMatrix[0].length;
                    break;
                }
            }
        }
        Ui.printBoard(board);
        endGame(finishedBoard(board), board);
    }

    public static void getUsedPiece(ArrayList<Piece> usedPieces) {
        String entry = Ui.getEntry();
        try {
            Piece piece = usedPieces.get(Integer.parseInt(entry));
            Pentomino.setPiece(piece);
        } catch (NumberFormatException nfe) {
            Ui.error();
        } catch(IndexOutOfBoundsException exeption){
            Ui.error();
        }
        
    }

    public static void replacePiece(Piece piece, Board board) {
        cleanBoard(piece, board);
        placePiece(piece, board);
    }

    public static void rotatePiece(Piece piece) {
        Ui.printRotateOptions();
        String entry = Ui.getEntry();
        switch (entry) {
            case "1": {//rotar derecha
                piece.setPieceMatrix(piece.rotateRight(piece));
                Pentomino.setPiece(piece);
                break;
            }
            case "2": {//rotar izquierda
                piece.setPieceMatrix(piece.rotateLeft(piece));
                Pentomino.setPiece(piece);
                break;
            }
            default: {
                Ui.error();
            }
        }
        Ui.printPiece(piece);
    }

    public static void reflectPiece(Piece piece) {
        Ui.printReflectOptions();
        String entry = Ui.getEntry();
        switch (entry) {
            case "1": {//reflejar vertical
                piece.setPieceMatrix(piece.reflectVertical(piece));
                Pentomino.setPiece(piece);
                break;
            }
            case "2": {//reflejar horizontal
                piece.setPieceMatrix(piece.reflectHorizontal(piece));
                Pentomino.setPiece(piece);
                break;
            }
            default: {
                Ui.error();
            }
        }
        Ui.printPiece(piece);
    }

    public static void cleanBoard(Piece piece, Board board) {

        Square[][] boardMatrix = (Square[][]) board.getBoard();
        Square[][] pieceMatrix = piece.getPieceMatrix();
        String pieceValue = piece.getValue();

        for (int row = 0; row < boardMatrix.length; row++) {
            for (int col = 0; col < boardMatrix.length; col++) {
                String boardValue = boardMatrix[row][col].getValue();
                if (boardValue == pieceValue) {
                    Square square = new Square(row, col, "□");
                    boardMatrix[row][col] = square;
                }
            }
        }
    }

    public static boolean containsPiece(ArrayList<Piece> usedPieces, Piece piece) {
        boolean valid = false;
        int count = 0;
        String string2 = piece.getClass().getSimpleName();
        for (int i = 0; i < usedPieces.size(); i++) {

            Piece itPiece = usedPieces.get(i);
            String string = itPiece.getClass().getSimpleName();

            if (string.equals(string2)) {
                count = count + 1;
            }

            if (count > 0) {
                valid = true;
                count = 0;
            } else {
                valid = false;
            }
        }

        return valid;
    }

    public static boolean finishedBoard(Board board) {
        boolean isFinished = false;
        int count = 0;
        int total = board.getRowDimension() * board.getColDimension();
        Square[][] boardMatrix = board.getBoard();

        for (int row = 1; row < boardMatrix.length - 1; row++) {
            for (int col = 1; col < boardMatrix[0].length - 1; col++) {
                Square squareBoard = boardMatrix[row][col];
                String str = squareBoard.getValue();

                if (str.equals("□")) {
                    count = count + 1;
                }
            }
        }

        if (count == 0) {
            isFinished = true;
        }
        return isFinished;
    }

    public static void endGame(boolean isFinished, Board board) {
        if (isFinished) {
            Pentomino.setStateForBoardMenu(false);
            Pentomino.setStateForMainMenu(false);
            Pentomino.setStateMainPieceMenu(false);
            Pentomino.setStateOptionPieceMenu(false);
            Ui.printCongratulations(board);
        }
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
