package com.example.interviewquestions.tictactoe;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.example.interviewquestions.tictactoe.model.Board;
import com.example.interviewquestions.tictactoe.model.GameStatus;
import com.example.interviewquestions.tictactoe.model.Pair;
import com.example.interviewquestions.tictactoe.model.PieceType;
import com.example.interviewquestions.tictactoe.model.Player;
import com.example.interviewquestions.tictactoe.model.PlayingPieceO;
import com.example.interviewquestions.tictactoe.model.PlayingPieceX;


public class TicTacToeGame {
    
    Deque<Player> players;
    Board board;
    Player winner;
    public void initializeGame() {

        players = new LinkedList<>();
        PlayingPieceX crosspiece = new PlayingPieceX();
        Player player1 = new Player("Player 1", crosspiece);

        PlayingPieceO circlepiece = new PlayingPieceO();
        Player player2 = new Player("Player 2", circlepiece);

        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public GameStatus startGame() {
        boolean NoWinner = true;

        while(NoWinner) {
            Player currentPlayer = players.removeFirst();
            board.printBoard();

            List<Pair<Integer, Integer>> freeCells = board.getFreeCells();
            if(freeCells.isEmpty()) {
                System.out.println("Game Drawn");
                return GameStatus.DRAW;
            }   
            System.out.print("Player " + currentPlayer.name + " Enter [row, col] ");
            Scanner inputScanner = new Scanner(System.in);

            String input = inputScanner.nextLine();
            String values[] = input.split(",");
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);

            boolean isvalidmove = board.addPiece(row, col, currentPlayer.playingPiece);

            if(!isvalidmove) {
                System.out.println("Invalid Move Try Again");
                players.addFirst(currentPlayer);
                continue;
            }

            players.addLast(currentPlayer);
            boolean isWinner = checkForWinner(row, col, currentPlayer.playingPiece.pieceType);
            if(isWinner) {
                board.printBoard();
               winner = currentPlayer;
               return GameStatus.WIN;

            }
        }
        
return GameStatus.DRAW;
    }

    boolean checkForWinner(int row, int col, PieceType pieceType) {


        //check row
       for(int i = 0; i < board.size; i++) {
        if(board.board[row][i] == null || board.board[row][i].pieceType != pieceType) {
            return false;
        }
       }
       
       //check column
       for(int i = 0; i < board.size; i++) {
        if(board.board[i][col] == null || board.board[i][col].pieceType != pieceType) {
            return false;
        }
       }
      
       // Check Diagonally
        for (int i = 0, j = 0; i < board.size; i++, j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
            return false;
            }
        }

        // Check Anti-Diagonally
        for (int i = 0, j = board.size - 1; i < board.size; i++, j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
            return false;
            }
        }

        return true;


    }
    

}
