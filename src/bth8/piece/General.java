package bth8.piece;

import bth8.Board;
import bth8.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class General extends Piece {
    public General(int x, int y) {
        super(x, y);
        this.value = 1;
    }

    //danh sach diem den hop le
    public List<Point> listPossiblePosition(int x, int y, Board board){
        List<Point> pointListPossible = new ArrayList<>();
        int[] moveX = {-1, 0, 1, 0};
        int[] moveY = {0, -1, 0, 1};
        for (int i = 0; i < moveY.length; i++){
            int x0 = x + moveX[i];
            int y0 = y + moveY[i];
            //viet them ham check vi tri cua tuong

            if (9 <= x0 && x0 <= 11 && 5 <= y0 && y0 <= 7) pointListPossible.add(new Point(x0, y0));
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
