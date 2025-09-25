import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[] numbers = {0,0,0,0,0};
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Print an integer: ");
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }
    System.out.println(sum);
    scanner.close();
    }
}

