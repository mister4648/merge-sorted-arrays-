
import java.util.*;

public class mergesortedarrays {

    public static void merge(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int left = n - 1;
        int right = 0;

        // Swap misplaced elements
        while (left >= 0 && right < m) {

            if (arr1[left] > arr2[right]) {

                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;

                left--;
                right++;
            }
            else {
                break;
            }
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};

        System.out.println("Before merging:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        merge(arr1, arr2);

        System.out.println("\nAfter merging:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
