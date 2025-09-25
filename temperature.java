import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celcius = scanner.nextInt();
        double farenheit = (double)celcius*9/5+32;
        System.out.println(farenheit);
        if (farenheit>=85){
            System.out.println("hot");
        }
        else if (farenheit>=60){
            System.out.println("moderate");
        }
        else if (farenheit<60){
            System.out.println("cold");
        }
        scanner.close();
    }
}
