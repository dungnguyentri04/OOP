package bth8.piece;

import bth8.Board;
import bth8.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Horse extends Piece {
    public Horse(int x, int y) {
        super(x, y);
        this.value = 6;
    }

    //danh sach diem den hop le
    public List<Point> listPossiblePosition(int x, int y, Board board){
        List<Point> pointListPossible = new ArrayList<>();
        int[] moveX = {-2, -2, -1, 1, 2, 2, 1, -1};
        int[] moveY = {-1, 1, 2, 2, 1, -1, -2, -2};
        int[] checkX = {-1, -1, 0, 0, 1, 1, 0, 0};
        int[] checkY = {0, 0, 1, 1, 0, 0, -1, -1};

        for (int i = 0; i < checkX.length; i++){
            int x0 = x + moveX[i];
            int y0 = y + moveY[i];
            //kiem tra quan co chan duong di
            int preventPositionX = x + checkX[i];
            int preventPositionY = y + checkY[i];
            //kiem tra ra ngoai bien va cac quan co chan duong di
            if (board.getBoard()[x0][y0] != -1 && board.getBoard()[preventPositionX][preventPositionY] == 0) pointListPossible.add(new Point(x0, y0));
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
