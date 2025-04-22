import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            } else if (Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                // If characters don't match, it's not a palindrome
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to check if it's a palindrome:");
        String str = scanner.nextLine();  // Read the entire line as input

        // Call the isPalindrome function and display the result
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
