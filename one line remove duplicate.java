import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueIntegerList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of integers to input
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        // Initialize an ArrayList to hold user input
        List<Integer> list = new ArrayList<>();

        // Prompt the user to enter n integers
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            list.add(input);
        }

        // Close the scanner
        scanner.close();

        // Remove duplicates by converting the list to a HashSet and back to a List
        list = new ArrayList<>(new HashSet<>(list));

        // Output the list without duplicates
        System.out.println("List without duplicates: " + list);
    }
}
