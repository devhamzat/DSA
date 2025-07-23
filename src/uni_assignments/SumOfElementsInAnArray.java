package uni_assignments;

public class SumOfElementsInAnArray {
    public static int sumArray(int[] arr, int length) {
        if (length <= 0) {
            return 0;
        }
        return sumArray(arr, length - 1) + arr[length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumArray(arr, arr.length);
        System.out.println("Sum of array elements: " + sum);
    }
}
