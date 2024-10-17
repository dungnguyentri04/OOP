package bth8.piece;

import bth8.Board;
import bth8.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Elephant extends Piece {
    public Elephant(int x, int y) {
        super(x, y);
        this.value = 3;
    }

    //danh sach cac o co the den
    public List<Point> listPossiblePosition(int x, int y, Board board){
        List<Point> pointListPossible = new ArrayList<>();
        int[] moveX = {-2, -2, 2, 2};
        int[] moveY = {-2, 2, -2, 2};
        int[] checkX = {-1, -1, 1, 1};// kiem tra cac o ngan can duong di
        int[] checkY = {-1, 1, -1, 1};
        for (int i = 0; i < checkX.length; i++){
            //kiem tra diem den co ra ngoai bien hoac co quan co nao chan duong di khong
            if (board.getBoard()[x + moveX[i]][y + moveY[i]] >= 0 && board.getBoard()[x + checkX[i]][y + checkY[i]] == 0){
                pointListPossible.add(new Point(x + moveX[i],y + moveY[i]));
            }
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
