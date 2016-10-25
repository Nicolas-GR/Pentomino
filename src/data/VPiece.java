package data;

public class VPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square vMatrix[][];
    private final static int x = 3;
    private final static int y = 3;
    private final char pieceName = 'V';
    private final String value = "@";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public VPiece() {
        this.setName(pieceName);
        vMatrix = new Square[x][y];

        for (int row = 0; row < vMatrix.length; row++) {
            for (int col = 0; col < vMatrix[0].length; col++) {
                if (row != vMatrix.length - 1 && col != 0) {
                    Square square = new Square(row, col, emptySquare);
                    vMatrix[row][col] = square;

                }else{
                    Square square = new Square(row, col, value);
                    vMatrix[row][col] = square;
                }
            }
        }
    }

    public VPiece(Square[][] vMatrix) {
        this.vMatrix = vMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] vMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < vMatrix.length; row++) {
            for (int col = 0; col < vMatrix[0].length; col++) {
                tempMatrix[row][col] = vMatrix[col][(vMatrix.length - 1) - row];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] vMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < vMatrix.length; row++) {
            for (int col = 0; col < vMatrix[0].length; col++) {
                tempMatrix[col][(vMatrix.length - 1) - row] = vMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] vMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < vMatrix.length; row++) {
            for (int col = 0; col < vMatrix[0].length; col++) {
                tempMatrix[row][(vMatrix.length - 1) - col] = vMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] vMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < vMatrix.length; row++) {
            for (int col = 0; col < vMatrix[0].length; col++) {
                tempMatrix[row][col] = vMatrix[(vMatrix.length - 1) - row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String prinvMatrix = "\n";

        for (int row = 0; row < vMatrix.length; row++) {
            prinvMatrix = prinvMatrix.concat("");
            for (int col = 0; col < vMatrix[0].length; col++) {
                prinvMatrix = prinvMatrix.concat(
                        String.valueOf(vMatrix[row][col]).concat(""));
            }
            prinvMatrix = prinvMatrix.concat("\n");
        }
        return prinvMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////    
    public Square[][] getvMatrix() {
        return vMatrix;
    }

    public void setvMatrix(Square[][] vMatrix) {
        this.vMatrix = vMatrix;
    }

}
