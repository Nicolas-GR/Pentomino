package data;

public abstract class Piece {

    
    private char name;
    
    abstract public  Square[][] rotateLeft(Square[][] matrix);
    abstract public  Square[][] rotateRight(Square[][] matrix);
    
    abstract public  Square[][] reflectVertical(Square[][] matrix);
    abstract public  Square[][] reflectHorizontal(Square[][] matrix);    

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
    
    
    
    
}
