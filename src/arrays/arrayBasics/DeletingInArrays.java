package arrays.arrayBasics;

public class DeletingInArrays {
    int findElement(int[] arr, int n, int key) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;

        }
        return -1;
    }

    int deleteElement(int arr[], int n, int key) {
        int pos = findElement(arr, n, key);
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        int i;
        for (i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];

        }
        return n - 1;
    }

    public static void main(String[] args) {
        DeletingInArrays deletingInArrays = new DeletingInArrays();
        int arr[] = new int[5];
        arr[0] = 2;
        arr[1] = 34;
        arr[2] = 22;
        arr[3] = 21;
        arr[4] = 20;
        int n = 5;
        int x = 20;
        deletingInArrays.deleteElement(arr, n, x);
    }
}
