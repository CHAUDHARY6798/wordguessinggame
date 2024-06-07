import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reversing the string
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);

        // Finding vowels
        String vowels = findVowels(input);
        System.out.println("Vowels: " + vowels);

        scanner.close();
    }

    // Function to reverse a string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    // Function to find vowels in a string
    public static String findVowels(String input) {
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.append(ch);
            }
        }
        return vowels.toString();
    }
}
