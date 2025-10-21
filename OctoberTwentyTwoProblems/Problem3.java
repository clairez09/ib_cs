package OctoberTwentyTwoProblems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] board = new int[8][8];

        System.out.print("Enter row and column for the first queen (1–8 1–8): ");
        int r1 = input.nextInt() - 1;
        int c1 = input.nextInt() - 1;

        System.out.print("Enter row and column for the second queen (1–8 1–8): ");
        int r2 = input.nextInt() - 1;
        int c2 = input.nextInt() - 1;

        board[r1][c1] = 1;
        board[r2][c2] = 1;

        System.out.println("\nChessboard:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        if (r1 == r2 || c1 == c2) {
            System.out.println("\nThe queens attack each other.");
        }
        else if (Math.abs(r1 - r2) == Math.abs(c1 - c2)) {
            System.out.println("\nThe queens attack each other.");
        }
        else {
            System.out.println("\nThe queens do NOT attack each other.");
        }

        input.close();
    }
}