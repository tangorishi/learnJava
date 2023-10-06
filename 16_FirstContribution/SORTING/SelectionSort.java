public class SelectionSort {
    // Sorts an array using Selection Sort algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the minimum element with the current element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Small array
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr1);
        System.out.println("Sorted array for Test Case 1:");
        printArray(arr1);

        // Test Case 2: Large array
        int[] arr2 = {5, 2, 9, 1, 5, 6, 0, 3, 8, 7, 4};
        selectionSort(arr2);
        System.out.println("Sorted array for Test Case 2:");
        printArray(arr2);
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
