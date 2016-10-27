package data;

public class UPiece extends Piece{



    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square uMatrix[][];
    private final static int a = 2;
    private final static int b = 3;
    private final char pieceName = 'U';
    private final String value = "¢";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public UPiece() {
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        uMatrix = new Square[a][b];

        for (int row = 0; row < uMatrix.length; row++) {
            for (int col = 0; col < uMatrix[0].length; col++) {
                if(row ==0 && col == 1){
                    Square square = new Square(row, col, emptySquare);
                    uMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, value);
                    uMatrix[row][col] = square;
                }
            }
        }
        this.setPieceMatrix(uMatrix);
    }

    public UPiece(Square[][] matrix) {
        this.uMatrix = matrix;
        this.setName(pieceName);
    }

    
}