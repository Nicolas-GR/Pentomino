package data;

public class Square {
    
    private int row;
    private int col;
    private String value;

    public Square(int row, int col, String value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    Square(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValue());
    }
    
    
    
    
    
}
