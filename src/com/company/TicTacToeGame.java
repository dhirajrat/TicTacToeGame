package com.company;

class TicTacToeGame
{
    static char[] board = new char[10];
    // createBoard Method
    public static char[] createBoard()
    {
        // Initializing Empty Array of Board
        for(int i=0;i<board.length;i++){
            board[i]=' ';
        }
        return board;
    }
    public static void main(String[] arg) {

        // Created Board for Play1
        char[] play1Board = createBoard();
    }
}

