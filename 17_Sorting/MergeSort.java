public class MergeSort {
    // Sorts an array using Merge Sort algorithm
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            
            // Split the array into two halves
            int[] left = new int[mid];
            int[] right = new int[n - mid];
            
            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, n - mid);
            
            // Recursively sort the two halves
            mergeSort(left);
            mergeSort(right);
            
            // Merge the sorted halves
            merge(arr, left, right);
        }
    }
    
    // Merges two sorted arrays into one sorted array
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        // Test Case 1: Small array
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(arr1);
        System.out.println("Sorted array for Test Case 1:");
        printArray(arr1);

        // Test Case 2: Large array
        int[] arr2 = {5, 2, 9, 1, 5, 6, 0, 3, 8, 7, 4};
        mergeSort(arr2);
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
