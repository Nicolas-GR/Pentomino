package data;

public class IPiece extends Piece{

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////

    private Square iMatrix[][];
    private final static int x = 5;
    private final static int y = 1;
    private final char pieceName = 'I';
    private final String value = "ø";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public IPiece() {
        this.setName(pieceName);
        iMatrix = new Square[x][y];

        for (int row = 0; row < iMatrix.length; row++) {
            for (int col = 0; col < iMatrix[0].length; col++) {
                Square square = new Square(row, col, value);
                iMatrix[row][col]=square;
            }
        }
    }

    public IPiece(Square[][] iMatrix) {
        this.iMatrix = iMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] matrix) {
        Square[][] temiMatrix = new Square[y][x];
        for (int row = 0; row < iMatrix.length; row++) {
            for (int col = 0; col < iMatrix[0].length; col++) {
                temiMatrix[iMatrix[0].length - 1 - col][row] = iMatrix[row][col];
            }
        }
        return temiMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] matrix) {
        Square[][] temiMatrix = new Square[y][x];
        for (int row = 0; row < iMatrix.length; row++) {
            for (int col = 0; col < iMatrix[0].length; col++) {
                temiMatrix[col][iMatrix.length - 1 - row] = iMatrix[row][col];
            }
        }
        return temiMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] matrix) {
        Square[][] temiMatrix = new Square[x][y];
        for (int row = 0; row < iMatrix.length; row++) {
            for (int col = 0; col < iMatrix[0].length; col++) {
                temiMatrix[row][iMatrix[0].length - 1 - col] = iMatrix[row][col];
            }
        }
        return temiMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] matrix) {
        Square[][] temiMatrix = new Square[x][y];
        for (int row = 0; row < iMatrix.length; row++) {
            for (int col = 0; col < iMatrix[0].length; col++) {
                temiMatrix[iMatrix.length -1 - row][col] = iMatrix[row][col];
            }
        }
        return temiMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String priniMatrix = "\n";

        for (int row = 0; row < iMatrix.length; row++) {
            priniMatrix = priniMatrix.concat("");
            for (int col = 0; col < iMatrix[0].length; col++) {
                priniMatrix = priniMatrix.concat(
                        String.valueOf(iMatrix[row][col]).concat(""));
            }
            priniMatrix = priniMatrix.concat("\n");
        }
        return priniMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////
    public Square[][] getiMatrix() {
        return iMatrix;
    }

    public void setiMatrix(Square[][] iMatrix) {
        this.iMatrix = iMatrix;
    }

}