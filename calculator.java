import java.util.Scanner;

public class calculator {
    
    // Function to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to divide two numbers with division-by-zero check
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("=== Welcome to the Java Simple Calculator ===");

        while (continueCalculation) {
            double num1 = 0, num2 = 0;
            boolean validInput = false;

            // Input: First number
            while (!validInput) {
                System.out.print("Enter the first number: ");
                if (scanner.hasNextDouble()) {
                    num1 = scanner.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }

            validInput = false;

            // Input: Second number
            while (!validInput) {
                System.out.print("Enter the second number: ");
                if (scanner.hasNextDouble()) {
                    num2 = scanner.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear invalid input
                }
            }

            // Display operation menu
            System.out.println("\nChoose an operation:");
            System.out.println("1 - Addition (+)");
            System.out.println("2 - Subtraction (-)");
            System.out.println("3 - Multiplication (*)");
            System.out.println("4 - Division (/)");
            System.out.print("Enter your choice (1-4): ");

            int choice = 0;
            validInput = false;

            while (!validInput) {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        validInput = true;
                    } else {
                        System.out.print("Invalid choice. Please enter a number between 1 and 4: ");
                    }
                } else {
                    System.out.print("Invalid input. Please enter a number between 1 and 4: ");
                    scanner.next(); // Clear invalid input
                }
            }

            // Perform calculation
            double result = 0;
            try {
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Ask user if they want to continue
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            String again = scanner.next();
            if (!again.equalsIgnoreCase("y")) {
                continueCalculation = false;
                System.out.println("Thank you for using the Java Calculator. Goodbye!");
            }
            System.out.println();
        }

        scanner.close();
    }
}

//hi
