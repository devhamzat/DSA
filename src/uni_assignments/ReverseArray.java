package uni_assignments;

import java.util.Arrays;

public class ReverseArray {
    static void reverseArray(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseArray(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int i = 1, j = 4; // Reverse elements between indices 1 and 4

        reverseArray(A, i, j);

        System.out.print("Reversed array: ");
        for (int k = 0; k < A.length; k++) {
            System.out.print(A[k] + " ");
        }
        System.out.println();
    }
}
