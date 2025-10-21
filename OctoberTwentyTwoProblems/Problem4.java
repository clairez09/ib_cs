package OctoberTwentyTwoProblems;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your message (max 81 chars): ");
        String message = input.nextLine();

        String cleanMessage = message.replaceAll("\\s+", "");

        if (cleanMessage.length() > 81) {
            System.out.println("Message too long! Must be 81 characters or fewer (excluding spaces).");
            input.close();
            return;
        }

        int length = cleanMessage.length();
        int rows = (int) Math.floor(Math.sqrt(length));
        int cols = (int) Math.ceil(Math.sqrt(length));

        if (rows * cols < length) rows++;

        char[][] grid = new char[rows][cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (index < length)
                    grid[i][j] = cleanMessage.charAt(index++);
                else
                    grid[i][j] = '\0'; 
            }
        }

        System.out.println("\nEncoded message:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] != '\0')
                    System.out.print(grid[i][j]);
            }
            System.out.print(" ");
        }

        input.close();
    }
}