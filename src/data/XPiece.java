package data;

public class XPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square xMatrix[][];
    private final static int a = 3;
    private final static int b = 3;
    private final char pieceName = 'X';
    private final String pieceValue = "×";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public XPiece() {
        this.setValue(pieceValue);
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        xMatrix = new Square[a][b];

        for (int row = 0; row < xMatrix.length; row++) {
            for (int col = 0; col < xMatrix[0].length; col++) {
                if (row == 0 || row == xMatrix.length - 1) {
                    if (col == 0 || col == xMatrix[0].length - 1) {
                        Square square = new Square(row, col, emptySquare);
                        xMatrix[row][col] = square;
                    } else {
                        Square square = new Square(row, col, pieceValue);
                        xMatrix[row][col] = square;
                    }
                } else {
                    Square square = new Square(row, col, pieceValue);
                    xMatrix[row][col] = square;
                }

            }
        }
        this.setPieceMatrix(xMatrix);
    }

    public XPiece(Square[][] matrix) {
        this.xMatrix = matrix;
        this.setName(pieceName);
    }

}
