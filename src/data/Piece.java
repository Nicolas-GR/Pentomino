package data;

public abstract class Piece {

    
    private char name;
    private Square pieceMatrix[][];
    private int x;
    private int y;
    private String value;
    
    //Método Rotar hacia la Izquierda.
    
    public Square[][] rotateLeft(Piece piece) {
        Square[][] matrix = piece.getPieceMatrix();
        Square[][] tempMatrix = new Square[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                tempMatrix[matrix[0].length - 1 - col][row] = matrix[row][col];
            }
        }
        return tempMatrix;
    }
    
    //Método Rotar hacia la Derecha.
    
    public Square[][] rotateRight(Piece piece) {
        Square[][] matrix = piece.getPieceMatrix();
        Square[][] tempMatrix = new Square[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                tempMatrix[col][matrix.length - 1 - row] = matrix[row][col];
            }
        }
        return tempMatrix;
    }
    
    //Método Reflejar Verticalmente.
    
    public Square[][] reflectVertical(Piece piece) {
        Square[][] matrix = piece.getPieceMatrix();
        Square[][] tempMatrix = new Square[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                tempMatrix[row][matrix[0].length - 1 - col] = matrix[row][col];
            }
        }
        return tempMatrix;
    }
    
    //Método Reflejar Horizontalmente.
    
    public  Square[][] reflectHorizontal(Piece piece){
        Square[][] matrix = piece.getPieceMatrix();
        Square[][] tempMatrix = new Square[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                tempMatrix[matrix.length -1 - row][col] = matrix[row][col];
            }
        }
        return tempMatrix;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public Square[][] getPieceMatrix() {
        return pieceMatrix;
    }

    public void setPieceMatrix(Square[][] pieceMatrix) {
        this.pieceMatrix = pieceMatrix;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    

    @Override
    public String toString() {
        String printMatrix = "\n";

        for (int row = 0; row < pieceMatrix.length; row++) {
            printMatrix = printMatrix.concat("");
            for (int col = 0; col < pieceMatrix[0].length; col++) {
                printMatrix = printMatrix.concat(
                        String.valueOf(pieceMatrix[row][col]).concat(""));
            }
            printMatrix = printMatrix.concat("\n");
        }
        return printMatrix;

    }
    
    
    
    
}
