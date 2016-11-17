package data;

public class YPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square yMatrix[][];
    private final static int a = 4;
    private final static int b = 2;
    private final char pieceName = 'Y';
    private final String pieceValue = "®";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public YPiece() {
        this.setValue(pieceValue);
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        yMatrix = new Square[a][b];

        for (int row = 0; row < yMatrix.length; row++) {
            for (int col = 0; col < yMatrix[0].length; col++) {
                if (col == 0 && row != 1) {
                    Square square = new Square(row, col, emptySquare);
                    yMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, pieceValue);
                    yMatrix[row][col] = square;
                }
            }
        }
        this.setPieceMatrix(yMatrix);
    }

    public YPiece(Square[][] matrix) {
        this.yMatrix = matrix;
        this.setName(pieceName);
    }

}
