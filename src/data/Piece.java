package data;

public abstract class Piece {

    
    
    abstract public  Square[][] rotateLeft(Square[][] matrix);
    abstract public  Square[][] rotateRight(Square[][] matrix);
    
    abstract public  Square[][] reflectVertical(Square[][] matrix);
    abstract public  Square[][] reflectHorizontal(Square[][] matrix);    
    
    
}
