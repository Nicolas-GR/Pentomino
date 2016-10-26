package data;

public class UPiece extends Piece{



    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square uMatrix[][];
    private final static int x = 2;
    private final static int y = 3;
    private final char pieceName = 'U';
    private final String value = "¢";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public UPiece() {
        this.setName(pieceName);
        uMatrix = new Square[x][y];

        for (int row = 0; row < uMatrix.length; row++) {
            for (int col = 0; col < uMatrix[0].length; col++) {
                if(row ==0 && col == 1){
                    Square square = new Square(row, col, emptySquare);
                    uMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, value);
                    uMatrix[row][col] = square;
                }
            }
        }
    }

    public UPiece(Square[][] uMatrix) {
        this.uMatrix = uMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < uMatrix.length; row++) {
            for (int col = 0; col < uMatrix[0].length; col++) {
                tempMatrix[uMatrix[0].length - 1 - col][row] = uMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < uMatrix.length; row++) {
            for (int col = 0; col < uMatrix[0].length; col++) {
                tempMatrix[col][uMatrix.length - 1 - row] = uMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < uMatrix.length; row++) {
            for (int col = 0; col < uMatrix[0].length; col++) {
                tempMatrix[row][uMatrix[0].length - 1 - col] = uMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < uMatrix.length; row++) {
            for (int col = 0; col < uMatrix[0].length; col++) {
                tempMatrix[uMatrix.length -1 - row][col] = uMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String prinuMatrix = "\n";

        for (int row = 0; row < uMatrix.length; row++) {
            prinuMatrix = prinuMatrix.concat("");
            for (int col = 0; col < uMatrix[0].length; col++) {
                prinuMatrix = prinuMatrix.concat(
                        String.valueOf(uMatrix[row][col]).concat(""));
            }
            prinuMatrix = prinuMatrix.concat("\n");
        }
        return prinuMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////
    public Square[][] getuMatrix() {
        return uMatrix;
    }

    public void setuMatrix(Square[][] uMatrix) {
        this.uMatrix = uMatrix;
    }

}

