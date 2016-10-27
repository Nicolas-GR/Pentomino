package data;

public class FPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square fMatrix[][];
    private final static int a = 3;
    private final static int b = 3;
    private final char pieceName = 'F';
    private final String value = "O";
    private final String emptySquare = " ";
    

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public FPiece() {
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        fMatrix = new Square[a][b];
        
        for (int row = 0; row < fMatrix.length; row++) {
            for (int col = 0; col < fMatrix[0].length; col++) {
                if (row == 0 && col == 0) {
                    Square square = new Square(row, col, emptySquare);
                    fMatrix[row][col] = square;
                } else if (row == 1 && col == 2) {
                    Square square = new Square(row, col, emptySquare);
                    fMatrix[row][col] = square;
                } else if (row == 2) {
                    if (col == 0) {
                        Square square = new Square(row, col, emptySquare);
                        fMatrix[row][col] = square;
                    } else if (col == 2) {
                        Square square = new Square(row, col, emptySquare);
                        fMatrix[row][col] = square;
                    } else {
                        Square square = new Square(row, col, value);
                        fMatrix[row][col] = square;
                    }

                } else {
                    Square square = new Square(row, col, value);
                    fMatrix[row][col] = square;
                }
            }

            this.setPieceMatrix(fMatrix);
        }
    }

    public FPiece(Square[][] matrix) {
        this.fMatrix = matrix;
        this.setName(pieceName);
    }

 
}