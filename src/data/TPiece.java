package data;

public class TPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square tMatrix[][];
    private final static int a = 3;
    private final static int b = 3;
    private final char pieceName = 'T';
    private final String value = "#";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public TPiece() {
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        tMatrix = new Square[a][b];

        for (int row = 0; row < tMatrix.length; row++) {
            for (int col = 0; col < tMatrix[0].length; col++) {
                if (col == 0 || col == tMatrix[0].length - 1) {
                    if (row != 0) {
                        Square square = new Square(row, col, emptySquare);
                        tMatrix[row][col] = square;
                    } else {
                        Square square = new Square(row, col, value);
                        tMatrix[row][col] = square;
                    }
                }else{
                        Square square = new Square(row, col, value);
                        tMatrix[row][col] = square;
                }
            }
        }
        this.setPieceMatrix(tMatrix);
    }

    public TPiece(Square[][] matrix) {
        this.tMatrix = matrix;
        this.setName(pieceName);
    }
}
