import java.util.Scanner;

public class PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;         // Numbers less than 2 are not prime
        if (num <= 3) return true;          // 2 and 3 are prime numbers
        if (num % 2 == 0 || num % 3 == 0) return false; // Eliminate multiples of 2 and 3

        // Check divisors up to the square root of num
        for (int i = 5; i <= Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }
pri