package data;

public class LPiece extends Piece {

    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    private Square lMatrix[][];
    private final static int a = 4;
    private final static int b = 2;
    private final char pieceName = 'L';
    private final String pieceValue = "¤";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    public LPiece() {
        this.setValue(pieceValue);
        this.setName(pieceName);
        this.setX(a);
        this.setY(b);
        lMatrix = new Square[a][b];

        for (int row = 0; row < lMatrix.length; row++) {
            for (int col = 0; col < lMatrix[0].length; col++) {
                if (col == lMatrix[0].length - 1 && row != lMatrix.length - 1) {
                    Square square = new Square(row, col, emptySquare);
                    lMatrix[row][col] = square;
                } else {
                    Square square = new Square(row, col, pieceValue);
                    lMatrix[row][col] = square;
                }
            }
        }
        this.setPieceMatrix(lMatrix);
    }

    public LPiece(Square[][] matrix) {
        this.lMatrix = matrix;
        this.setName(pieceName);
    }

    }
