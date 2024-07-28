package arrays.bubbleSort;

public class BubbleSort {
    //set arrays to sort
    //create an inner loop that goes through the array and swaps the values if the first value is higher than the next value
    //an outer loop that controls how many times the inner loop must run
    public static void main(String[] args) {
        int[] array = {12, 20, 3, 1, 40, 0, 6, 7, 2, 41, 60, 10, 11, 22, 18, 50};
        int arrayLength = array.length;
        System.out.println(" length of array : "+ arrayLength);
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - 1 - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        System.out.println("sorted array: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}
