package data;

public class NPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square nMatrix[][];
    private final static int a = 4;
    private final static int b = 2;
    private final char pieceName = 'N';
    private final String value = "©";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public NPiece() {
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        nMatrix = new Square[a][b];

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
        this.setPieceMatrix(nMatrix);
    }

    public NPiece(Square[][] matrix) {
        this.nMatrix = matrix;
        this.setName(pieceName);
    }
}