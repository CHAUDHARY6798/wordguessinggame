import java.util.Scanner;

public class WordGuessingGame {
    public static void main(String[] args) {
        String secretWord = "bunny";
        int attempts = 6;
        StringBuilder guessedWord = new StringBuilder("X".repeat(secretWord.length()));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the secret word. You have 6 attempts.");
        System.out.println(guessedWord);

        while (attempts > 0) {
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (secretWord.contains(String.valueOf(guess))) {
                System.out.println("Correct guess!");
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                    }
                }
                System.out.println(guessedWord);
                if (guessedWord.toString().equals(secretWord)) {
                    System.out.println("Congratulations! You foundthe word: " + secretWord);
                    break;
                }
            } else {
                System.out.println("Please try again:");
                attempts--;
                System.out.println("Attempts left: " + attempts);
                if (attempts == 0) {
                    System.out.println("Sorry, you ran out of attempts. The secret word was: " + secretWord);
                    break;
                }
            }
        }
    }
}