package arrays.insertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 6, 10, 1,3,10,8,7,19,0};
        int arraySize = array.length;
        for (int i = 1; i < arraySize; i++) {
            int index = i;
            int currentValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                index = j;
                j--;
            }
            array[index] = currentValue;
        }
        System.out.println("sorted array : ");
        for (int values : array) {
            System.out.println(values);
        }
    }

}
