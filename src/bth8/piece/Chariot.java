package bth8.piece;

import bth8.Board;
import bth8.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chariot extends Piece {
    public Chariot(int x, int y) {
        super(x, y);
        this.value = 4;
    }

    private int checkPositionChariot(int x, int y, Board board){
        if (board.getBoard()[x][y] == -1) return -1;
        else if (board.getBoard()[x][y] > 0) return 0;
        else return 1;

    }

    //danh sach diem den hop le
    public List<Point> listPossiblePosition(int x, int y, Board board){
        List<Point> pointListPossible = new ArrayList<>();
        int x0 = x, y0 =y;

        //kiem tra hang doc tren
        while (true){
            x0 --;
            if (checkPositionChariot(x0, y, board) == -1) break;
            else if (checkPositionChariot(x0, y, board) == 0) {
                pointListPossible.add(new Point(x0, y));
                x0 = x;
                break;
            }
            else pointListPossible.add(new Point(x0, y));
        }

        //hang doc duoi
        while (true){
            x0 ++;
            if (checkPositionChariot(x0, y, board) == -1) break;
            else if (checkPositionChariot(x0, y, board) == 0) {
                pointListPossible.add(new Point(x0, y));
                x0 = x;
                break;
            }
            else pointListPossible.add(new Point(x0, y));
        }

        //hang ngang trai
        while (true){
            y0 --;
            if (checkPositionChariot(x, y0, board) == -1) break;
            else if (checkPositionChariot(x, y0, board) == 0) {
                pointListPossible.add(new Point(x, y0));
                y0 = y;
                break;
            }
            else pointListPossible.add(new Point(x, y0));
        }

        //hang ngang phai
        while (true){
            y0 ++;
            if (checkPositionChariot(x, y0, board) == -1) break;
            else if (checkPositionChariot(x, y0, board) == 0) {
                pointListPossible.add(new Point(x, y0));
                y0 = y;
                break;
            }
            else pointListPossible.add(new Point(x, y0));
        }

        return pointListPossible;
    }

    @Override
    public Point randomMove(Board board){
        List<Point> pointListPossible = listPossiblePosition(getX(), getY(), board);
        if (pointListPossible.isEmpty()) return null;
        else {
            //lay ngau nhien mot buoc di hop le
            Random random = new Random();
            int randomIndex = random.nextInt(pointListPossible.size());
            return pointListPossible.get(randomIndex);
        }
    }

    @Override
    public boolean canMoveTo(int x0, int y0, Board board){
        return true;
    }

}
