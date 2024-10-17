package bth8.piece;

import bth8.Board;
import bth8.Point;

public class Piece {
    private int x;
    private int y;
    protected int value;

    public Piece(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean canMoveTo(int x0, int y0, Board board){
        return false;
    }

    public Point randomMove(Board board) {
        return null;
    }

    //di chuyen quan co den noi hop le
    public void moveTo(int x0, int y0,Board board){
        board.deleteQuanCo(this);
        setX(x0);
        setY(y0);
        board.addQuanCo(this);
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getValue() {
        return value;
    }

}
