package arrays.arrayBasics;

public class DeletingInArrays {
    int findElement(int[] arr, int arrayLength, int key) {
        int i;
        for (i = 0; i < arrayLength; i++) {
            if (arr[i] == key)
                return i;

        }
        return -1;
    }

    int deleteElement(int[] arr, int arrayLength, int key) {
        int pos = findElement(arr, arrayLength, key);
        if (pos == -1) {
            System.out.println("Element not found");
            return arrayLength;
        }

        for (int i = pos; i < arrayLength - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return arrayLength - 1;
    }

    public static void main(String[] args) {
        DeletingInArrays deletingInArrays = new DeletingInArrays();
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 34;
        arr[2] = 22;
        arr[3] = 21;
        arr[4] = 20;
        int arrayLength = 5;
        int key = 2;
        System.out.println("before deleting");
        for (int j : arr) {
            System.out.println(j);
        }
        arrayLength = deletingInArrays.deleteElement(arr, arrayLength, key);

        System.out.println("after deleting ");
        for (int j = 0; j < arrayLength; j++) {
            System.out.println(arr[j]);
        }
    }
}
