import java.util.Scanner;

public class PalindromeNumbers {

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the upper limit of the range
        System.out.print("Enter the upper limit of the range (n): ");
        int n = scanner.nextInt();

        System.out.print("Palindrome numbers from 1 to " + n + ": ");

        // Iterate from 1 to n and check for palindromes
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        scanner.close();
    }
}
