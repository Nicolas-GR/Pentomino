package data;

public class XPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square xMatrix[][];
    private final static int x = 3;
    private final static int y = 3;
    private final char pieceName = 'X';
    private final String value = "×";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public XPiece() {
        this.setName(pieceName);
        xMatrix = new Square[x][y];

        for (int row = 0; row < xMatrix.length; row++) {
            for (int col = 0; col < xMatrix[0].length; col++) {
                if (row == 0 || row == xMatrix.length - 1) {
                    if (col == 0 || col == xMatrix[0].length - 1) {
                        Square square = new Square(row, col, emptySquare);
                        xMatrix[row][col] = square;
                    } else {
                        Square square = new Square(row, col, value);
                        xMatrix[row][col] = square;
                    }
                } else {
                    Square square = new Square(row, col, value);
                    xMatrix[row][col] = square;
                }

            }
        }
    }

    public XPiece(Square[][] xMatrix) {
        this.xMatrix = xMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] xMatrix) {
        return xMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] xMatrix) {
        return xMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] xMatrix) {
        return xMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] xMatrix) {
        return xMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        String prinxMatrix = "\n";

        for (int row = 0; row < xMatrix.length; row++) {
            prinxMatrix = prinxMatrix.concat("");
            for (int col = 0; col < xMatrix[0].length; col++) {
                prinxMatrix = prinxMatrix.concat(
                        String.valueOf(xMatrix[row][col]).concat(""));
            }
            prinxMatrix = prinxMatrix.concat("\n");
        }
        return prinxMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////                                                             
    public Square[][] getxMatrix() {
        return xMatrix;
    }

    public void setxMatrix(Square[][] xMatrix) {
        this.xMatrix = xMatrix;
    }

}
