package data;

public class LPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square lMatrix[][];
    private final static int x = 4;
    private final static int y = 2;
    private final char pieceName = 'L';
    private final String value = "¤";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public LPiece() {
        this.setName(pieceName);
        lMatrix = new Square[x][y];

        for (int row = 0; row < lMatrix.length; row++) {
            for (int col = 0; col < lMatrix[0].length; col++) {
                if (col == lMatrix[0].length - 1 && row != lMatrix.length - 1) {
                    Square square = new Square(row, col, emptySquare);
                    lMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, value);
                    lMatrix[row][col] = square;
                }
            }
        }
    }

    public LPiece(Square[][] lMatrix) {
        this.lMatrix = lMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < lMatrix.length; row++) {
            for (int col = 0; col < lMatrix[0].length; col++) {
                tempMatrix[lMatrix[0].length - 1 - col][row] = lMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < lMatrix.length; row++) {
            for (int col = 0; col < lMatrix[0].length; col++) {
                tempMatrix[col][lMatrix.length - 1 - row] = lMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < lMatrix.length; row++) {
            for (int col = 0; col < lMatrix[0].length; col++) {
                tempMatrix[row][lMatrix[0].length - 1 - col] = lMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < lMatrix.length; row++) {
            for (int col = 0; col < lMatrix[0].length; col++) {
                tempMatrix[lMatrix.length -1 - row][col] = lMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String prinlMatrix = "\n";

        for (int row = 0; row < lMatrix.length; row++) {
            prinlMatrix = prinlMatrix.concat("");
            for (int col = 0; col < lMatrix[0].length; col++) {
                prinlMatrix = prinlMatrix.concat(
                        String.valueOf(lMatrix[row][col]).concat(""));
            }
            prinlMatrix = prinlMatrix.concat("\n");
        }
        return prinlMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////
    public Square[][] getlMatrix() {
        return lMatrix;
    }

    public void setlMatrix(Square[][] lMatrix) {
        this.lMatrix = lMatrix;
    }

}
