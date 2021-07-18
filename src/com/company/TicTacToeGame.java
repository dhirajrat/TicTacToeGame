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
        for (int i = 0; i < board.length-1; i++) {
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
        System.out.println("Enter a Move choice 'x' or 'o' ");
        moveChoice = sc.next().charAt(0);
        if((moveChoice != 'x') && (moveChoice != 'o')){
            System.out.println("invalid choice");
            moveChoice = playersMoveChoice();
        }
        System.out.println("Move choice taken is ( "+moveChoice+" )");
        return moveChoice;
    }
    /*
        Method to Show the board
    */
    public static void showBoard(char[] boardToShow)
    {
        int count=0;
        for(int i=0;i<boardToShow.length-1;i++)
        {
            count++;
            System.out.print((i+1)+"[ "+boardToShow[i]+" ]  ");
            if(count == 3){
                System.out.println("\n");
                count = 0;
            }
        }
    }
    /*
        Method to add input to location board
    */
    public static char[] moveToDesiredLocation(char[] oldBoard)
    {
        Scanner dlo = new Scanner(System.in);
        System.out.println("enter a location where you want to add input");
        int location = (dlo.nextInt() - 1);
        if(oldBoard[location] == ' ')
        {
            oldBoard[location] = playersMoveChoice();
        }
        else {
            System.out.println("Location is already reserved select another location");
        }
        return oldBoard;
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
        // calling showBoard method
        showBoard(play1Board);
        // Fill out the location on board
        play1Board=moveToDesiredLocation(play1Board);
        showBoard(play1Board);
    }
}

