import java.util.Scanner;
public class programmingExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String food = scanner.next();
        if (food.equals("Pasta") || food.equals("PASTA")){
            System.out.println("Go to Italy.");
        }
        else {
            System.out.println(food + " will never replace pasta!");
        }

    }
}

// food <-- INPUT
// if food = "Pasta" or "PASTA":
// output "Go to Italy"
// else:
// output food + "will never replace pasta!"
