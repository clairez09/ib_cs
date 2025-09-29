import java.util.Scanner;

public class wordArray {

    // Method to check if a word is palindrome
    public static void palindromeCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("Yes, it is a palindrome");
        } else {
            System.out.println("No, it is not a palindrome");
        }
    }

    // Method to count vowels in a sentence
    public static void vowelCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Total number of vowels: " + count);
    }
     public static void wordLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split by spaces
        String[] words = sentence.split("\\s+");

        // Print each word with its length
        for (String word : words) {
            System.out.println("\"" + word + "\" -> " + word.length());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        palindromeCheck();
        vowelCount();
        wordLength();
        scanner.close();
    }
}