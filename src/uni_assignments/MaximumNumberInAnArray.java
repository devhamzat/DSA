package uni_assignments;

public class MaximumNumberInAnArray {
    static int maximumNumber(int[] arr, int length) {

        if (length==1) {
           return arr[length];
        }
        int maxInRest = maximumNumber(arr, length - 1);
        return Math.max(maxInRest, arr[length - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int maximumNumber = maximumNumber(arr, arr.length);
        System.out.printf("Maximum number is: %d%n", maximumNumber);
    }
}
