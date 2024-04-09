package arrays.bubbleSort;

public class BubbleSortImproved {
    //we would still implement the same idea from the BubbleSort Class but this time,we want the algorithm to stop if it goes through the array once and nothing is changed or stop when the only sort required is done
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 7, 6, 8, 9, 10};
        int arrayLength = array.length;
        System.out.println(arrayLength);
        for (int i = 0; i < arrayLength - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arrayLength - 1 - 1; j++) {
                if (array[j]>array[j+1]){
                    int temporary = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temporary;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i <arrayLength;i++){
            System.out.println(array[i]+ " ");
        }
    }
}
