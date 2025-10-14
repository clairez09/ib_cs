package OctoberFourteenExercises;
import java.util.Scanner;

public class arrays3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j < arr[i].length;j++){
                System.out.println("Enter a number: ");
                arr[i][j]= input.nextInt();
            }
        }
        for (int k = 0; k<arr.length;k++){
            for (int l = 0; l < arr[k].length;l++){
                System.out.print(arr[k][l] + " ");
            }
            System.out.print("\n");
        }
        int diagonalSum = 0;
        int secDiagonalSum = 0;
        for (int m = 0; m<arr.length;m++){
            diagonalSum+=arr[m][m];
            secDiagonalSum+=arr[m][2-m];
        }
        System.out.println(diagonalSum);
        System.out.println(secDiagonalSum);



        input.close();

    }
}