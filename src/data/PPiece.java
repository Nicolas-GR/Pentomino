package data;

public class PPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square pMatrix[][];
    private final static int a = 3;
    private final static int b = 2;
    private final char pieceName = 'P';
    private final String value = "■";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public PPiece() {
        this.setX(a);
        this.setY(b);
        this.setName(pieceName);
        pMatrix = new Square[a][b];

        for (int row = 0; row < pMatrix.length; row++) {
            for (int col = 0; col < pMatrix[0].length; col++) {
                if (row == pMatrix.length - 1 && col == pMatrix[0].length - 1) {
                    Square square = new Square(row, col, emptySquare);
                    pMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, value);
                    pMatrix[row][col] = square;
                }
            }
        }
        this.setPieceMatrix(pMatrix);
    }

    public PPiece(Square[][] matrix) {
        this.pMatrix = matrix;
        this.setName(pieceName);
    }

   
}
