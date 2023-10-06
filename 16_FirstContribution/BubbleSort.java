public class BubbleSort {
    // Sorts an array using Bubble Sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--; // Decrease the size of the unsorted portion
        } while (swapped);
    }

    public static void main(String[] args) {
        // Test Case 1: Small array
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr1);
        System.out.println("Sorted array for Test Case 1:");
        printArray(arr1);

        // Test Case 2: Large array
        int[] arr2 = {5, 2, 9, 1, 5, 6, 0, 3, 8, 7, 4};
        bubbleSort(arr2);
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
