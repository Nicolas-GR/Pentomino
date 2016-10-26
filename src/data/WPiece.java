package data;


public class WPiece extends Piece{
    
    ///////////////////////////////////////////////////////////////////////////
    //Atributos
    ///////////////////////////////////////////////////////////////////////////
    
    private Square wMatrix[][];
    private final static int x = 3;
    private final static int y = 3;
    private final char pieceName = 'W';
    private final String value = "*";
    private final String emptySquare = " ";

    ///////////////////////////////////////////////////////////////////////////
    //Constructores
    ///////////////////////////////////////////////////////////////////////////
    
    public WPiece() {
        this.setName(pieceName);
        wMatrix = new Square[x][y];

        for (int row = 0; row < wMatrix.length; row++) {
            for (int col = 0; col < wMatrix[0].length; col++) {
                if (row == 0 && col != 0) {
                    Square square = new Square(row, col, emptySquare);
                    wMatrix[row][col] = square;
                }else if (row == 1 && col == wMatrix[0].length -1){
                    Square square = new Square(row, col, emptySquare);
                    wMatrix[row][col] = square;
                }else if (row == wMatrix.length - 1 && col == 0){
                    Square square = new Square(row, col, emptySquare);
                    wMatrix[row][col] = square;
                }else{
                    Square square = new Square(row, col, value);
                    wMatrix[row][col] = square;
                }
            }
        }
    }

    public WPiece(Square[][] wMatrix) {
        this.wMatrix = wMatrix;
        this.setName(pieceName);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura de métodos para rotar y reflejar.
    ///////////////////////////////////////////////////////////////////////////
    
    //Método Rotar hacia la Izquierda.
    @Override
    public Square[][] rotateLeft(Square[][] wMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < wMatrix.length; row++) {
            for (int col = 0; col < wMatrix[0].length; col++) {
                tempMatrix[row][col] = wMatrix[col][(wMatrix.length - 1) - row];
            }
        }
        return tempMatrix;
    }

    //Método Rotar hacia la Derecha.
    @Override
    public Square[][] rotateRight(Square[][] wMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < wMatrix.length; row++) {
            for (int col = 0; col < wMatrix[0].length; col++) {
                tempMatrix[col][(wMatrix.length - 1) - row] = wMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Verticalmente.
    @Override
    public Square[][] reflectVertical(Square[][] wMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < wMatrix.length; row++) {
            for (int col = 0; col < wMatrix[0].length; col++) {
                tempMatrix[row][(wMatrix.length - 1) - col] = wMatrix[row][col];
            }
        }
        return tempMatrix;
    }

    //Método Reflejar Horizontalmente.
    @Override
    public Square[][] reflectHorizontal(Square[][] wMatrix) {
        Square[][] tempMatrix = new Square[x][y];
        for (int row = 0; row < wMatrix.length; row++) {
            for (int col = 0; col < wMatrix[0].length; col++) {
                tempMatrix[row][col] = wMatrix[(wMatrix.length - 1) - row][col];
            }
        }
        return tempMatrix;
    }

    ///////////////////////////////////////////////////////////////////////////
    // Sobre escritura del método toString.
    ///////////////////////////////////////////////////////////////////////////   
    @Override
    public String toString() {
        String prinwMatrix = "\n";

        for (int row = 0; row < wMatrix.length; row++) {
            prinwMatrix = prinwMatrix.concat("");
            for (int col = 0; col < wMatrix[0].length; col++) {
                prinwMatrix = prinwMatrix.concat(
                        String.valueOf(wMatrix[row][col]).concat(""));
            }
            prinwMatrix = prinwMatrix.concat("\n");
        }
        return prinwMatrix;

    }

    ///////////////////////////////////////////////////////////////////////////
    //Setters y Getters
    ///////////////////////////////////////////////////////////////////////////    
    public Square[][] getwMatrix() {
        return wMatrix;
    }

    public void setwMatrix(Square[][] wMatrix) {
        this.wMatrix = wMatrix;
    }



}
