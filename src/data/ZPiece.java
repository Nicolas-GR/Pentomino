package data;

public class ZPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square zMatrix[][];
    private final static int a = 3;
    private final static int b = 3;
    private final char pieceName = 'Z';
    private final String pieceValue = "ø";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public ZPiece() {
        this.setValue(pieceValue);
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        zMatrix = new Square[a][b];

        for (int row = 0; row < zMatrix.length; row++) {
            for (int col = 0; col < zMatrix[0].length; col++) {
                if (col == 0 && row != 0) {
                    Square square = new Square(row, col, emptySquare);
                    zMatrix[row][col] = square;
                } else if (col == zMatrix[0].length - 1 && row != zMatrix.length - 1) {
                    Square square = new Square(row, col, emptySquare);
                    zMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, pieceValue);
                    zMatrix[row][col] = square;
                }
            }
        }
        this.setPieceMatrix(zMatrix);
    }

    public ZPiece(Square[][] matrix) {
        this.zMatrix = matrix;
        this.setName(pieceName);
    }

}
