package data;

public class VPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square vMatrix[][];
    private final static int a = 3;
    private final static int b = 3;
    private final char pieceName = 'V';
    private final String pieceValue = "@";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public VPiece() {
        this.setValue(pieceValue);
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        vMatrix = new Square[a][b];

        for (int row = 0; row < vMatrix.length; row++) {
            for (int col = 0; col < vMatrix[0].length; col++) {
                if (row != vMatrix.length - 1 && col != 0) {
                    Square square = new Square(row, col, emptySquare);
                    vMatrix[row][col] = square;

                } else {
                    Square square = new Square(row, col, pieceValue);
                    vMatrix[row][col] = square;
                }
            }
        }
        this.setPieceMatrix(vMatrix);
    }

    public VPiece(Square[][] matrix) {
        this.vMatrix = matrix;
        this.setName(pieceName);
    }

}
