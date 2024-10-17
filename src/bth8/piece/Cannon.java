package bth8.piece;

import bth8.Board;
import bth8.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cannon extends Piece {
    public Cannon(int x, int y) {
        super(x, y);
        this.value = 5;
    }

    private int checkPositionCannon(int x, int y, Board board){
        if (board.getBoard()[x][y] == -1) return -1;//ra khoi bien
        else if (board.getBoard()[x][y] > 0) return 0; // gap quan co khac
        else return 1; // khong gap quan co nao
    }

    public List<Point> listPossiblePosition(int x, int y, Board board){
        List<Point> pointListPossible = new ArrayList<>();
        int x0 = x, y0 = y;//vi tri di chuyen
        //kiem tra hang doc tren
        while (true){
            x0 --;
            if (checkPositionCannon(x0, y, board) == -1) break;
            else if (checkPositionCannon(x0, y, board) == 0) {// buoc di nhay qua mot quan co
                while (true) {
                    x0 --;
                    if (checkPositionCannon(x0, y, board) == -1) break;
                    else if (checkPositionCannon(x0, y, board) == 0){
                        pointListPossible.add(new Point(x0, y));
                        break;
                    }
                }
                x0 = x;
                break;
            }
            else pointListPossible.add(new Point(x0, y));
        }

        //hang doc duoi
        while (true){
            x0 ++;
            if (checkPositionCannon(x0, y, board) == -1) break;
            else if (checkPositionCannon(x0, y, board) == 0) {
                while (true) {
                    x0 ++;
                    if (checkPositionCannon(x0, y, board) == -1) break;
                    else if (checkPositionCannon(x0, y, board) == 0){
                        pointListPossible.add(new Point(x0, y));
                        break;
                    }
                }
                x0 = x;
                break;
            }
            else pointListPossible.add(new Point(x0, y));
        }

        while (true){
            y0 --;
            if (checkPositionCannon(x, y0, board) == -1) break;
            else if (checkPositionCannon(x, y0, board) == 0) {
                while (true) {
                    y0 --;
                    if (checkPositionCannon(x, y0, board) == -1) break;
                    else if (checkPositionCannon(x, y0, board) == 0){
                        pointListPossible.add(new Point(x, y0));
                        break;
                    }
                }
                y0 = y;
                break;
            }
            else pointListPossible.add(new Point(x, y0));
        }

        while (true){
            y0 ++;
            if (checkPositionCannon(x, y0, board) == -1) break;
            else if (checkPositionCannon(x, y0, board) == 0) {
                while (true) {
                    y0 ++;
                    if (checkPositionCannon(x, y0, board) == -1) break;
                    else if (checkPositionCannon(x, y0, board) == 0){
                        pointListPossible.add(new Point(x, y0));
                        break;
                    }
                }
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
