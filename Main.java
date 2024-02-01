package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //create a 3x3 board for the game
        char[][] board = new char[3][3];
        //input the board to be empty initially
        for(int i =0; i< board.length;i++){
            for(int j =0; j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
        //print the empty board
        System.out.println("---------");
        System.out.println("| "+board[0][0]+" "+board[0][1]+" "+board[0][2]+" |");
        System.out.println("| "+board[1][0]+" "+board[1][1]+" "+board[1][2]+" |");
        System.out.println("| "+board[2][0]+" "+board[2][1]+" "+board[2][2]+" |");
        System.out.println("---------");

        boolean run = true;
        int turn = 1;
        //loop for the game to start
        do{
            //check if input is Integer
            if(!scanner.hasNextInt()){
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }else {
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                //check if the inputs are between 1 and 3
                if(first<1||first>3||second<1||second>3){
                    System.out.println("Coordinates should be from 1 to 3!");
                }else if (board[first-1][second-1]!=' '){//check if the input coordinate is empty or not
                    System.out.println("This cell is occupied! Choose another one!");
                }else {
                    //condition to determine X or O turn
                    if(turn%2!=0){
                        board[first-1][second-1]='X';
                        turn++;
                    }else {
                        board[first-1][second-1]='O';
                        turn++;
                    }

                    //print board after user input coordinates
                    System.out.println("---------");
                    System.out.println("| "+board[0][0]+" "+board[0][1]+" "+board[0][2]+" |");
                    System.out.println("| "+board[1][0]+" "+board[1][1]+" "+board[1][2]+" |");
                    System.out.println("| "+board[2][0]+" "+board[2][1]+" "+board[2][2]+" |");
                    System.out.println("---------");

                    char a = board[0][0];
                    char b = board[0][1];
                    char c = board[0][2];
                    char d = board[1][0];
                    char e = board[1][1];
                    char f = board[1][2];
                    char g = board[2][0];
                    char h = board[2][1];
                    char ii = board[2][2];

                    int xCount = 0;
                    int oCount = 0;
                    int bCount = 0;
                    int count = 0;
                    //boolean three = false;
                    boolean xThree = false;
                    boolean oThree = false;
                    for(int i = 0; i < board.length; i++){
                        for(int j=0;j<board[i].length;j++){
                            if(board[i][j]==' '){
                                bCount++;
                            }

                        }

                    }
                    //checks to see if three in a row
                    if(a==b && b==c){
                        //three = true;
                        if(a=='X'){
                            xThree = true;
                        }
                        if(a=='O'){
                            oThree = true;
                        }
                    }
                    if(d==e && e==f){
                        //three = true;
                        if (d == 'X') {
                            xThree = true;
                        }
                        if (d == 'O') {

                            oThree = true;
                        }
                    }
                    if(g==h && h==ii){
                        //three = true;
                        if (g == 'X') {
                            xThree = true;
                        }
                        if (g == 'O') {

                            oThree = true;
                        }
                    }
                    if(a==d && d==g){
                        //three = true;
                        if (d == 'X') {
                            xThree = true;
                        }
                        if (d == 'O') {

                            oThree = true;
                        }
                    }
                    if(b==e && e==h){
                        // three = true;
                        if (b == 'X') {
                            xThree = true;
                        }
                        if (b == 'O') {

                            oThree = true;
                        }
                    }
                    if(c==f && f==ii){
                        //three = true;
                        if (c == 'X') {
                            xThree = true;
                        }
                        if (c == 'O') {

                            oThree = true;
                        }
                    }

                    if(a==e && e==ii){
                        //three = true;
                        if (a == 'X') {
                            xThree = true;
                        }
                        if (a == 'O') {

                            oThree = true;
                        }
                    }
                    if(g==e && e==c){
                        //three = true;
                        if (g == 'X') {
                            xThree = true;
                        }
                        if (g == 'O') {

                            oThree = true;
                        }
                    }
                    //check to see if both X and O has three in a row
                    if(xThree==true && oThree==true){
                        System.out.println("Impossible");
                    } else if (xThree==true && oThree==false) {//check to see if X is winner
                        System.out.println("X wins");
                        run=false;//breaking the loop for the entire game
                    } else if (xThree==false && oThree==true) {//check to see if O is winner
                        System.out.println("O wins");
                        run=false;//breaking the loop for entire game
                    }
                    //if(count>1 && bCount>0){
                     //   System.out.println("Impossible");
                    //}
                    //else if(xThree==false && oThree==false && bCount>0){
                     //   System.out.println("Game not finished");
                   // }
                    //check if game is draw
                    if(xThree==false && oThree==false && bCount==0){
                        System.out.println("Draw");
                        run=false;//breaking the loop for entire game
                    }

                }
            }
        }while(run);





    }
}
