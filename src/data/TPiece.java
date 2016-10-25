package data;

public class TPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square tMatrix[][];
    private final static int x = 3;
    private final static int y = 3;
    private final char pieceName = 'T';
    private final String value = "#";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public TPiece() {
        this.setName(pieceName);
        tMatrix = new Square[x][y];

        for (int row = 0; row < tMatrix.length; row++) {
            for (int col = 0; col < tMatrix[0].length; col++) {
                if (col == 0 || col == tMatrix[0].length - 1) {
                    if (row != 0) {
                        Square square = new Square(row, col, " ");
                        tMatrix[row][col] = square;
                    } else {
                        Square square = new Square(row, col, value);
                        tMatrix[row][col] = square;
                    }
                }else{
                        Square square = new Square(row, col, value);
                        tMatrix[row][col] = square;
                }
            }
        }
    }

    public TPiece(Square[][] tMatrix) {
        this.tMatrix = tMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] tMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < tMatrix.length; row++) {
            for (int col = 0; col < tMatrix[0].length; col++) {
                tempMatrix[row][col] = tMatrix[col][(tMatrix.length - 1) - row];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] tMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < tMatrix.length; row++) {
            for (int col = 0; col < tMatrix[0].length; col++) {
                tempMatrix[col][(tMatrix.length - 1) - row] = tMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] tMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < tMatrix.length; row++) {
            for (int col = 0; col < tMatrix[0].length; col++) {
                tempMatrix[row][(tMatrix.length - 1) - col] = tMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] tMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < tMatrix.length; row++) {
            for (int col = 0; col < tMatrix[0].length; col++) {
                tempMatrix[row][col] = tMatrix[(tMatrix.length - 1) - row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////    
    @Override
    public String toString() {
        String printMatrix = "\n";

        for (int row = 0; row < tMatrix.length; row++) {
            printMatrix = printMatrix.concat("");
            for (int col = 0; col < tMatrix[0].length; col++) {
                printMatrix = printMatrix.concat(
                        String.valueOf(tMatrix[row][col]).concat(""));
            }
            printMatrix = printMatrix.concat("\n");
        }
        return printMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////
    public Square[][] gettMatrix() {
        return tMatrix;
    }

    public void settMatrix(Square[][] tMatrix) {
        this.tMatrix = tMatrix;
    }

}
