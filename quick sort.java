public class QuickSort {

    // Method to swap elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition method to place pivot in correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choose the pivot (first element of the partition)
        int i = low + 1; // Start from the beginning
        int j = high; // Start from the end

        while (i <= j) {
            // Increment i while elements are less than or equal to pivot
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // Decrement j while elements are greater than pivot
            while (arr[j] > pivot) {
                j--;
            }
            // Swap elements if i is less than j
            if (i < j) {
                swap(arr, i, j);
            }
        }
        // Place the pivot in its correct position
        swap(arr, low, j); // When i > j
        return j; // Return the index of the pivot
    }

    // QuickSort recursive method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high); // Partition the array
            quickSort(arr, low, pIndex - 1); // Recursively sort the left subarray
            quickSort(arr, pIndex + 1, high); // Recursively sort the right subarray
        }
    }

    // Main method to test the QuickSort implementation
    public static void main(String[] args) {
        int[] arr = {4, 6, 6, 2, 5, 7, 9, 9, 1, 3};
        int n = arr.length;

        System.out.println("Before Using Quick Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSort(arr, 0, n - 1);

        System.out.println("After Using Quick Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
