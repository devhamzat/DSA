package arrays.selectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9 };
        int arr_size = arr.length;
        for (int i = 0; i < arr_size-1; i++) {
            int index = i;
            for (int j = i + 1; j < arr_size; j++) {
                if (arr[i] > arr[j]) {
                    i=j;
                }
            }
            int value = arr[i];
            for (int k = index; k>i;k--){
                arr[k] = arr[k-1];
            }
            arr[i]=value;
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i<arr_size; i++){
            System.out.println(arr[i]) ;
        }
    }
}
