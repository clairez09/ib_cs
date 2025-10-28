package OctoberTwentyTwoProblems;

public class Problem1 {
    public static void main(String[] args) {
        int[][] map = {
            {34, 21, 32, 41, 25},
            {14, 42, 43, 14, 31},
            {54, 45, 52, 42, 23},
            {33, 15, 51, 31, 35},
            {21, 52, 33, 13, 23}
        };
        System.out.println("The places visited are: ");

        int row = 0;
        int column = 0;

        while (true) {
            int temp = map[row][column];
            int nextRow = (temp / 10) - 1;
            int nextColumn = (temp % 10) - 1;
            System.out.println("Visited: " + temp);

            if (nextRow == row && nextColumn == column) {
                System.out.println("The treasure is at (" + (row + 1) + ", " + (column + 1) + ")");
                break;
            }

            row = nextRow;
            column = nextColumn;
        }
    }
}