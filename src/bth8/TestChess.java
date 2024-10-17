package bth8;

import bth8.piece.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestChess {

    public static void playGame(Board board, int n){
        List<Piece> pieceListInGame = board.getPieceList(); // cac quan co tren ban co
        Random random = new Random();
        for (int i = 0; i < n; i++){
            while (true) {
                int randomIndex = random.nextInt(pieceListInGame.size());
                Piece pieceRandom = pieceListInGame.get(randomIndex);
                //Lay random quan co va random buoc di
                System.out.println("random piece : " + pieceRandom.getX() + " " + pieceRandom.getY());
                Point movePoint = pieceRandom.randomMove(board);
                if (movePoint != null){
                    System.out.println("Move point : " + movePoint.getX() + " " + movePoint.getY());
                    pieceRandom.moveTo(movePoint.getX(), movePoint.getY(),board);
                    for (Piece piece : pieceListInGame){
                        if (piece.getX() == movePoint.getX() && piece.getY() == movePoint.getY()){
                            pieceListInGame.remove(piece);
                            break;
                        }
                    }
                    break;
                }
            }
            board.displayBoard();//hien thi ban co sau moi lan random
        }

    }


    public static void main(String[] args){
        Board board = new Board();
        General general = new General(11,6);
        Advisor advisor1 = new Advisor(11,5);
        Advisor advisor2 = new Advisor(11,7);
        Elephant elephant1 = new Elephant(11,4);
        Elephant elephant2 = new Elephant(11,8);
        Chariot chariot1 = new Chariot(11,2);
        Chariot chariot2 = new Chariot(11,10);
        Cannon cannon1 = new Cannon(9,3);
        Cannon cannon2 = new Cannon(9,9);
        Horse horse1 = new Horse(11,3);
        Horse horse2 = new Horse(11,9);
        Solider solider1 = new Solider(8,2);
        Solider solider2 = new Solider(8,4);
        Solider solider3 = new Solider(8,6);
        Solider solider4 = new Solider(8,8);
        Solider solider5 = new Solider(8,10);

        //cac quan co duoc them vao ban co
        board.getPieceList().add(general);
        board.getPieceList().add(advisor2);
        board.getPieceList().add(advisor1);
        board.getPieceList().add(elephant1);
        board.getPieceList().add(elephant2);
        board.getPieceList().add(chariot1);
        board.getPieceList().add(chariot2);
        board.getPieceList().add(cannon1);
        board.getPieceList().add(cannon2);
        board.getPieceList().add(horse1);
        board.getPieceList().add(horse2);
        board.getPieceList().add(solider1);
        board.getPieceList().add(solider2);
        board.getPieceList().add(solider3);
        board.getPieceList().add(solider4);
        board.getPieceList().add(solider5);

        //them vao ban co
        board.addQuanCo(general);
        board.addQuanCo(advisor1);
        board.addQuanCo(advisor2);
        board.addQuanCo(elephant1);
        board.addQuanCo(elephant2);
        board.addQuanCo(chariot1);
        board.addQuanCo(chariot2);
        board.addQuanCo(cannon1);
        board.addQuanCo(cannon2);
        board.addQuanCo(horse1);
        board.addQuanCo(horse2);
        board.addQuanCo(solider1);
        board.addQuanCo(solider2);
        board.addQuanCo(solider3);
        board.addQuanCo(solider4);
        board.addQuanCo(solider5);


        board.displayBoard();

        playGame(board,5);

    }

}
