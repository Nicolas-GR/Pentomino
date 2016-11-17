package data;

public class WPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square wMatrix[][];
    private final static int a = 3;
    private final static int b = 3;
    private final char pieceName = 'W';
    private final String pieceValue = "*";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public WPiece() {
        this.setValue(pieceValue);
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        wMatrix = new Square[a][b];

        for (int row = 0; row < wMatrix.length; row++) {
            for (int col = 0; col < wMatrix[0].length; col++) {
                if (row == 0 && col != 0) {
                    Square square = new Square(row, col, emptySquare);
                    wMatrix[row][col] = square;
                } else if (row == 1 && col == wMatrix[0].length - 1) {
                    Square square = new Square(row, col, emptySquare);
                    wMatrix[row][col] = square;
                } else if (row == wMatrix.length - 1 && col == 0) {
                    Square square = new Square(row, col, emptySquare);
                    wMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, pieceValue);
                    wMatrix[row][col] = square;
                }
            }
        }
        this.setPieceMatrix(wMatrix);
    }

    public WPiece(Square[][] matrix) {
        this.wMatrix = matrix;
        this.setName(pieceName);
    }
}
