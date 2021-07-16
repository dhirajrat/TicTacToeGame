package com.company;

import java.util.Scanner;

class TicTacToeGame {
    static char[] board = new char[10];
    static char moveChoice;
    /*
        CreateBoard Method
    */
    public static char[] createBoard() {
        // Initializing Empty Array of Board
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
    /*
        Method to take input for player
    */
    public static char playersMoveChoice()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Move choice X or O");
        moveChoice = sc.next().charAt(0);
        System.out.println("Move choice taken is ( "+moveChoice+" )");
        return moveChoice;
    }
    /*
        Method to Show the board
    */
    public static void showBoard(char[] boardToShow)
    {
        int count=0;
        for(int i=0;i<boardToShow.length;i++)
        {
            count++;
            System.out.print("[ "+boardToShow[i]+" ]  ");
            if(count == 3){
                System.out.println("\n");
                count = 0;
            }
        }
    }
    /*
        main Method
    */
    public static void main(String[] arg) {
        // Created Board for Play1
        char[] play1Board = createBoard();
        // Taking Inputs for player and computer
        System.out.println("** FOR player");
        char playerChoice = playersMoveChoice();
        System.out.println("** FOR computer");
        char computerChoice = playersMoveChoice();
        showBoard(play1Board);
    }
}

