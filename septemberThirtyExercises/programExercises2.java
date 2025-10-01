package septemberThirtyExercises;
import java.util.Scanner;
public class programExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String word = scanner.next();
        for (int i=1;i<= number;i++){
            System.out.println(word.charAt(i-1));
        }
        scanner.close();
    }
}
