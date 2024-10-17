package bth8;

import bth8.piece.Piece;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int[][] board;
    private List<Piece> pieceList;

    public Board(){
        board = new int[14][13];
        pieceList = new ArrayList<>();

        //khoi tao gia tri ban co
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 13; j++) {
                // Gán giá trị -1 cho 2 hàng và 2 cột đầu tiên và cuối cùng
                if (i < 2 || i >= 12 || j < 2 || j >= 12) {
                    board[i][j] = -1; // Gán giá trị -1 cho các ô biên
                } else {
                    board[i][j] = 0; // Gán giá trị 0 cho các ô bên trong
                }
            }
        }

    }

    public boolean canAdd(Piece piece){
        return true;
    }//can sua them

    //them vi tri quan co
    public void addQuanCo(Piece piece){
        board[piece.getX()][piece.getY()] = piece.getValue();
    }

    //xoa vi tri quan co
    public void deleteQuanCo(Piece piece){
        board[piece.getX()][piece.getY()] = 0;
    }

    //hien thi ban co hien tai
    public void displayBoard(){
        for (int i = 2; i < 12; i ++){
            for (int j = 2; j < 11; j ++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int[][] getBoard() {
        return board;
    }

    public List<Piece> getPieceList() {
        return pieceList;
    }
}
