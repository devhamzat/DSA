package arrays.arrayBasics;

public class InsertingInArray {

    void insertElement(int arr[], int position, int n, int x) {
        int arrSize = arr.length;
        int index = position - 1;

        if (arrSize == n) {
            System.out.println("array size is not big enough to insert a new element");
        } else {
            for (int i = n - 1; i >= index; i--) {
                arr[i + 1] = arr[i];

            }
            arr[position] = x;
        }

    }

    public static void main(String[] args) {
        InsertingInArray insertingInArray = new InsertingInArray();
        int arr[] = new int[6];
        arr[0] = 2;
        arr[1] = 34;
        arr[2] = 22;
        arr[3] = 21;
        arr[4] = 20;
        arr[5] = 20;
        int n = 4;
        int x = 5, pos = 2;
        System.out.println("before insertion : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("  ");

        insertingInArray.insertElement(arr, pos, n, x);

        System.out.println("after insertion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }

}
