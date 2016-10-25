package data;

import data.Square;

public class FPiece extends Piece {
    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    
    private Square fMatrix[][];
    private final static int x = 3;
    private final static int y = 3;
    private final char pieceName = 'F';
    
    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    
    public FPiece() {
        this.setName(pieceName);
        fMatrix = new Square[x][y];

        for (int row = 0; row < fMatrix.length; row++) {
            for (int col = 0; col < fMatrix[0].length; col++) {
                if (row == 0 && col == 0) {
                    Square square = new Square(row, col, " ");
                    fMatrix[row][col] = square;
                } else if (row == 1 && col == 2) {
                    Square square = new Square(row, col, " ");
                    fMatrix[row][col] = square;
                } else if (row == 2) {
                    if (col == 0) {
                        Square square = new Square(row, col, " ");
                        fMatrix[row][col] = square;
                    } else if (col == 2) {
                        Square square = new Square(row, col, " ");
                        fMatrix[row][col] = square;
                    } else {
                        Square square = new Square(row, col, "O");
                        fMatrix[row][col] = square;
                    }

                } else {
                    Square square = new Square(row, col, "O");
                    fMatrix[row][col] = square;
                }
            }
        }
    }
    
    public FPiece(Square[][] fMatrix) {
        this.fMatrix = fMatrix;
        this.setName(pieceName);
    }
    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    
    //Método Rotar hacia la Izquierda.
    
    @Override
    public Square[][] rotateLeft(Square[][] fMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < fMatrix.length; row++) {
            for (int col = 0; col < fMatrix[0].length; col++) {
                tempMatrix[row][col] = fMatrix[col][(fMatrix.length - 1) - row];
            }
        }
        return tempMatrix;
    }
    
    //Método Rotar hacia la Derecha.
    
    @Override
    public Square[][] rotateRight(Square[][] fMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < fMatrix.length; row++) {
            for (int col = 0; col < fMatrix[0].length; col++) {
                tempMatrix[col][(fMatrix.length - 1) - row] = fMatrix[row][col];
            }
        }
        return tempMatrix;
    }
    
    //Método Reflejar Verticalmente.
    
    @Override
    public Square[][] reflectVertical(Square[][] fMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < fMatrix.length; row++) {
            for (int col = 0; col < fMatrix[0].length; col++) {
                tempMatrix[row][(fMatrix.length - 1) - col] = fMatrix[row][col];
            }
        }
        return tempMatrix;
    }
    
    //Método Reflejar Horizontalmente.

    @Override
    public Square[][] reflectHorizontal(Square[][] fMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < fMatrix.length; row++) {
            for (int col = 0; col < fMatrix[0].length; col++) {
                tempMatrix[row][col] = fMatrix[(fMatrix.length - 1) - row][col];
            }
        }
        return tempMatrix;
    }

    @Override
    public String toString() {
        String printMatrix = "\n";

        for (int row = 0; row < fMatrix.length; row++) {
            printMatrix = printMatrix.concat("");
            for (int col = 0; col < fMatrix[0].length; col++) {
                printMatrix = printMatrix.concat(
                        String.valueOf(fMatrix[row][col]).concat(""));
            }
            printMatrix = printMatrix.concat("\n");
        }
        return printMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////

    public Square[][] getfMatrix() {
        return fMatrix;
    }

    public void setfMatrix(Square[][] fMatrix) {
        this.fMatrix = fMatrix;
    }

}
