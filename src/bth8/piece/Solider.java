package bth8.piece;

import bth8.Board;
import bth8.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solider extends Piece {
    public Solider(int x, int y) {
        super(x, y);
        this.value = 7;
    }


    //Phuong thuc lay tat ca cac truong hop co the den
    public List<Point> listPossiblePosition(int x,int y, Board board){
        List<Point> pointListPossible = new ArrayList<>();
        if (x <= 6){
            int[] moveX = {-1, 0, 0};
            int[] moveY = {0, -1, 1};
            for (int i = 0; i < moveY.length; i++){
                if (board.getBoard()[x + moveX[i]][y + moveY[i]] != -1) pointListPossible.add(new Point(x + moveX[i],y + moveY[i]));
            }
        }
        else {
            if (board.getBoard()[x - 1][y] != -1)  pointListPossible.add(new Point(x - 1, y));
        }
        return pointListPossible;
    }

    //ngau nhien buoc di
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

    //Kiem tra diem den co hop le khong
    @Override
    public boolean canMoveTo(int x0, int y0, Board board){
        return true;
    }

}
