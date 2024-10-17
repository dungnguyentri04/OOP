package bth8.piece;

import bth8.Board;
import bth8.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Advisor extends Piece {
    public Advisor(int x, int y) {
        super(x, y);
        this.value = 2;
    }

    public List<Point> listPossiblePosition(int x, int y, Board board){
        List<Point> pointListPossible = new ArrayList<>();
        if (y == 5 || y == 7) pointListPossible.add(new Point(6, 6));
        else if (y == 6) {
            int[] moveX = {-1, -1, 1, 1};
            int[] moveY = {-1, 1, -1, 1};
            for (int i = 0; i < moveY.length; i++) pointListPossible.add(new Point(x + moveX[i], y + moveY[i]));
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
