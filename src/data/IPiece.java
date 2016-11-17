package data;

public class IPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square iMatrix[][];
    private final static int a = 5;
    private final static int b = 1;
    private final char pieceName = 'I';
    private final String pieceValue = "±";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public IPiece() {
        this.setValue(pieceValue);
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        iMatrix = new Square[a][b];

        for (int row = 0; row < iMatrix.length; row++) {
            for (int col = 0; col < iMatrix[0].length; col++) {
                Square square = new Square(row, col, pieceValue);
                iMatrix[row][col] = square;
            }
        }
        this.setPieceMatrix(iMatrix);
    }

    public IPiece(Square[][] matrix) {
        this.iMatrix = matrix;
        this.setName(pieceName);
    }

}
