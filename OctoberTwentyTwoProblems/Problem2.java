package OctoberTwentyTwoProblems;

public class Problem2 {
    public static void main(String[] args) {
        int[][] array = {
            {34, 21, 32, 41, 25},
            {14, 42, 43, 14, 31},
            {54, 45, 52, 42, 23},
            {33, 15, 51, 31, 35},
            {21, 52, 33, 13, 23}
        };

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            int rowMax = array[i][0];
            int colIndex = 0;

            for (int j = 1; j < 5; j++) {
                if (array[i][j] > rowMax) {
                    rowMax = array[i][j];
                    colIndex = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < 5; k++) {
                if (array[k][colIndex] < rowMax) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle point at (" + (i + 1) + ", " + (colIndex + 1) + ") = " + rowMax);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No saddle points");
        }
    }
}