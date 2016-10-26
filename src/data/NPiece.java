package data;

public class NPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square nMatrix[][];
    private final static int x = 4;
    private final static int y = 2;
    private final char pieceName = 'N';
    private final String value = "ø";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public NPiece() {
        this.setName(pieceName);
        nMatrix = new Square[x][y];

        for (int row = 0; row < nMatrix.length; row++) {
            for (int col = 0; col < nMatrix[0].length; col++) {
                if (col == 0 && row == 0) {
                    Square square = new Square(row, col, emptySquare);
                    nMatrix[row][col] = square;
                } else if (col == nMatrix[0].length - 1) {
                    if (row == nMatrix.length - 2) {
                        Square square = new Square(row, col, emptySquare);
                        nMatrix[row][col] = square;
                    } else if (row == nMatrix.length - 1) {
                        Square square = new Square(row, col, emptySquare);
                        nMatrix[row][col] = square;
                    } else {
                        Square square = new Square(row, col, value);
                        nMatrix[row][col] = square;
                    }
                } else {
                    Square square = new Square(row, col, value);
                    nMatrix[row][col] = square;
                }
            }
        }
    }

    public NPiece(Square[][] nMatrix) {
        this.nMatrix = nMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < nMatrix.length; row++) {
            for (int col = 0; col < nMatrix[0].length; col++) {
                tempMatrix[nMatrix[0].length - 1 - col][row] = nMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < nMatrix.length; row++) {
            for (int col = 0; col < nMatrix[0].length; col++) {
                tempMatrix[col][nMatrix.length - 1 - row] = nMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < nMatrix.length; row++) {
            for (int col = 0; col < nMatrix[0].length; col++) {
                tempMatrix[row][nMatrix[0].length - 1 - col] = nMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < nMatrix.length; row++) {
            for (int col = 0; col < nMatrix[0].length; col++) {
                tempMatrix[nMatrix.length -1 - row][col] = nMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String prinnMatrix = "\n";

        for (int row = 0; row < nMatrix.length; row++) {
            prinnMatrix = prinnMatrix.concat("");
            for (int col = 0; col < nMatrix[0].length; col++) {
                prinnMatrix = prinnMatrix.concat(
                        String.valueOf(nMatrix[row][col]).concat(""));
            }
            prinnMatrix = prinnMatrix.concat("\n");
        }
        return prinnMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////
    public Square[][] getnMatrix() {
        return nMatrix;
    }

    public void setnMatrix(Square[][] nMatrix) {
        this.nMatrix = nMatrix;
    }

}
