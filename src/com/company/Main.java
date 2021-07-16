package com.company;

class TicTacToeGame
{
    // createBoard Method
    public char[] createBoard()
    {
        // Initializing Empty
        char[] board = new char[10];
        for(int i=1;i<10;i++){
            board[i]=' ';
        }
        return board;
    }
}
public class Main {
    public static void main(String[] arg) {
        TicTacToeGame Play1 = new TicTacToeGame();
        char[] play1Board = Play1.createBoard();
    }
}
