package OctoberFourteenExercises;
import java.util.Scanner;

public class arrays2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[] colsum = new int[3];
        int[] rowsum = new int[3];
        for (int i = 0; i<arr.length;i++){
            int sum = 0;
            for (int j = 0; j < arr[i].length;j++){
                System.out.println("Enter a number: ");
                arr[i][j]= input.nextInt();
                sum += arr[i][j];
                colsum[j] += arr[i][j];
            }
            rowsum[i] = sum;
        }
        for (int k = 0;k<3;k++){
            System.out.println("The sum for row " + k + " is " + rowsum[k]);
            System.out.println("The average of column " + k + " is " + (double)colsum[k]/(double)3);
        }
        input.close();

    }
}
