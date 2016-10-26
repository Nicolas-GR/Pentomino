package data;

public class ZPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square zMatrix[][];
    private final static int x = 3;
    private final static int y = 3;
    private final char pieceName = 'Z';
    private final String value = "ø";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public ZPiece() {
        this.setName(pieceName);
        zMatrix = new Square[x][y];

        for (int row = 0; row < zMatrix.length; row++) {
            for (int col = 0; col < zMatrix[0].length; col++) {
                if (col == 0 && row != 0) {
                    Square square = new Square(row, col, emptySquare);
                    zMatrix[row][col] = square;
                } else if (col == zMatrix[0].length - 1 && row != zMatrix.length - 1) {
                    Square square = new Square(row, col, emptySquare);
                    zMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, value);
                    zMatrix[row][col] = square;
                }
            }
        }
    }

    public ZPiece(Square[][] zMatrix) {
        this.zMatrix = zMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] zMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < zMatrix.length; row++) {
            for (int col = 0; col < zMatrix[0].length; col++) {
                tempMatrix[row][col] = zMatrix[col][(zMatrix.length - 1) - row];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] zMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < zMatrix.length; row++) {
            for (int col = 0; col < zMatrix[0].length; col++) {
                tempMatrix[col][(zMatrix.length - 1) - row] = zMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] zMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < zMatrix.length; row++) {
            for (int col = 0; col < zMatrix[0].length; col++) {
                tempMatrix[row][(zMatrix.length - 1) - col] = zMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] zMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < zMatrix.length; row++) {
            for (int col = 0; col < zMatrix[0].length; col++) {
                tempMatrix[row][col] = zMatrix[(zMatrix.length - 1) - row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String prinzMatrix = "\n";

        for (int row = 0; row < zMatrix.length; row++) {
            prinzMatrix = prinzMatrix.concat("");
            for (int col = 0; col < zMatrix[0].length; col++) {
                prinzMatrix = prinzMatrix.concat(
                        String.valueOf(zMatrix[row][col]).concat(""));
            }
            prinzMatrix = prinzMatrix.concat("\n");
        }
        return prinzMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////
    public Square[][] getzMatrix() {
        return zMatrix;
    }

    public void setzMatrix(Square[][] zMatrix) {
        this.zMatrix = zMatrix;
    }

}
