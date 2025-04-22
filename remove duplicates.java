import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize the array with user-defined size
        int[] arr = new int[n];

        // Taking array elements input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Convert array to a Set to remove duplicates
        Set<Integer> set = new HashSet<>();
        
        // Adding elements from array to the Set
        for (int num : arr) {
            set.add(num);
        }
        
        // Convert Set back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        // Display the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
        
        // Close the scanner
        scanner.close();
    }
}
