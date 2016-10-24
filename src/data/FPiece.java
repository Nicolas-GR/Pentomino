package data;

import data.Square;

public class FPiece extends Piece {

    private Square fMatrix[][];
    private final static int x = 3;
    private final static int y = 3;
    
    public FPiece() {

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

    @Override
    public Square[][] rotateLeft(Square[][] fMatrix) {
        this.rotateRight(fMatrix);
        this.rotateRight(fMatrix);
        this.rotateRight(fMatrix);
        return fMatrix;
    }

    @Override
    public Square[][] rotateRight(Square[][] fMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for(int row = 0; row < fMatrix.length; row++){
            for (int col = 0; col < fMatrix[0].length; col ++){
                
            }
        }
        return fMatrix;
    }

    @Override
    public Square[][] reflectVertical(Square[][] fMatrix) {
        return fMatrix;
    }

    @Override
    public Square[][] reflectHorizontal(Square[][] fMatrix) {
        return fMatrix;
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

}
