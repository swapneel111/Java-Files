import java.util.Arrays;

public class MergeSortExample {

    // Method to merge two halves in sorted order
    public static void merge(int[] arr, int low, int mid, int high, int[] temp) {
        int left = low;
        int right = mid + 1;
        int k = low;

        // Merging elements in sorted order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        // If elements on the left half are still left
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        // If elements on the right half are still left
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        // Copying the sorted elements back to the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    // Method to perform merge sort
    public static void mergeSort(int[] arr, int low, int high, int[] temp) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, low, mid, temp);
            mergeSort(arr, mid + 1, high, temp);

            // Merge the sorted halves
            merge(arr, low, mid, high, temp);
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5, 6, 8};
        int n = arr.length;

        // Temporary array to use during merge operations
        int[] temp = new int[n];

        System.out.println("Before Sorting Array:");
        printArray(arr);

        mergeSort(arr, 0, n - 1, temp);

        System.out.println("After Sorting Array:");
        printArray(arr);
    }
}
