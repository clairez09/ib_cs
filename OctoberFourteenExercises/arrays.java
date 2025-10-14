package OctoberFourteenExercises;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args){
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j < arr[i].length;j++){
                System.out.println("Enter a number: ");
                arr[i][j]= input.nextInt();
                sum += arr[i][j];
                count += 1;
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Average is " +(double) sum / (double) count);
        input.close();

    }
}