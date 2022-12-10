package Backtracking;

public class NQueens {

    public static void nQueens(char arr[][], int row) {
        // base case
        if (row == arr.length) {
            System.out.println("---------- chess board -----------");
            printBoard(arr);
            count++;
            return;
        }
        // recursion
        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                nQueens(arr, row + 1); // fun call
                arr[row][j] = 'x'; // backtracking step
            }
        }
    }

    public static boolean nQueensOneSol(char arr[][], int row) {
        // base case
        if (row == arr.length) {
            return true;
        }

        // recursion
        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                if (nQueensOneSol(arr, row + 1)) {
                    return true;
                }
                arr[row][j] = 'x'; // backtracking step
            }
        }

        return false;
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // check vertical up safe or not
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // check diagonal left up safe or not
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // check diagonal right up safe or not
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        // all solutions
        nQueens(board, 0);

        // solutions possible or not and print one solution
        if (nQueensOneSol(board, 0)) {
            System.out.println("Solution is possible.");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible.");
        }

        // count all solutions
        System.out.println("Total no. of ways to solve n queen is: " + count);
    }
}
