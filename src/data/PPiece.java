package data;

public class PPiece extends Piece {





    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square pMatrix[][];
    private final static int x = 3;
    private final static int y = 2;
    private final char pieceName = 'P';
    private final String value = "■";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public PPiece() {
        this.setName(pieceName);
        pMatrix = new Square[x][y];

        for (int row = 0; row < pMatrix.length; row++) {
            for (int col = 0; col < pMatrix[0].length; col++) {
                if(row ==pMatrix.length -1  && col == pMatrix[0].length-1){
                    Square square = new Square(row, col, emptySquare);
                    pMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, value);
                    pMatrix[row][col] = square;
                }
            }
        }
    }

    public PPiece(Square[][] pMatrix) {
        this.pMatrix = pMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < pMatrix.length; row++) {
            for (int col = 0; col < pMatrix[0].length; col++) {
                tempMatrix[pMatrix[0].length - 1 - col][row] = pMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] matrix) {
        Square[][] tempMatrix = new Square[y][x];
        for (int row = 0; row < pMatrix.length; row++) {
            for (int col = 0; col < pMatrix[0].length; col++) {
                tempMatrix[col][pMatrix.length - 1 - row] = pMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < pMatrix.length; row++) {
            for (int col = 0; col < pMatrix[0].length; col++) {
                tempMatrix[row][pMatrix[0].length - 1 - col] = pMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] matrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < pMatrix.length; row++) {
            for (int col = 0; col < pMatrix[0].length; col++) {
                tempMatrix[pMatrix.length -1 - row][col] = pMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String prinpMatrix = "\n";

        for (int row = 0; row < pMatrix.length; row++) {
            prinpMatrix = prinpMatrix.concat("");
            for (int col = 0; col < pMatrix[0].length; col++) {
                prinpMatrix = prinpMatrix.concat(
                        String.valueOf(pMatrix[row][col]).concat(""));
            }
            prinpMatrix = prinpMatrix.concat("\n");
        }
        return prinpMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////
    public Square[][] getpMatrix() {
        return pMatrix;
    }

    public void setpMatrix(Square[][] pMatrix) {
        this.pMatrix = pMatrix;
    }

}


