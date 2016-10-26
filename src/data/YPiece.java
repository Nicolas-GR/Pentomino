package data;

public class YPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square yMatrix[][];
    private final static int x = 4;
    private final static int y = 2;
    private final char pieceName = 'Y';
    private final String value = "ø";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public YPiece() {
        this.setName(pieceName);
        yMatrix = new Square[x][y];

        for (int row = 0; row < yMatrix.length; row++) {
            for (int col = 0; col < yMatrix[0].length; col++) {
                if (col == 0 && row != 1) {
                    Square square = new Square(row, col, emptySquare);
                    yMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, value);
                    yMatrix[row][col] = square;
                }
            }
        }
    }

    public YPiece(Square[][] yMatrix) {
        this.yMatrix = yMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < yMatrix.length; row++) {
            for (int col = 0; col < yMatrix[0].length; col++) {
                tempMatrix[yMatrix[0].length -1 -col][row] = yMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < yMatrix.length; row++) {
            for (int col = 0; col < yMatrix[0].length; col++) {
                tempMatrix[col][yMatrix.length - 1 - row] = yMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < yMatrix.length; row++) {
            for (int col = 0; col < yMatrix[0].length; col++) {
                tempMatrix[row][yMatrix[0].length - 1 - col] = yMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < yMatrix.length; row++) {
            for (int col = 0; col < yMatrix[0].length; col++) {
                tempMatrix[yMatrix.length -1 - row][col] = yMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String prinyMatrix = "\n";

        for (int row = 0; row < yMatrix.length; row++) {
            prinyMatrix = prinyMatrix.concat("");
            for (int col = 0; col < yMatrix[0].length; col++) {
                prinyMatrix = prinyMatrix.concat(
                        String.valueOf(yMatrix[row][col]).concat(""));
            }
            prinyMatrix = prinyMatrix.concat("\n");
        }
        return prinyMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////
    public Square[][] getyMatrix() {
        return yMatrix;
    }

    public void setyMatrix(Square[][] yMatrix) {
        this.yMatrix = yMatrix;
    }

}
