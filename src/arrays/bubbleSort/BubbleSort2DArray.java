package arrays.bubbleSort;

public class BubbleSort2DArray {
    public static void main(String[] args) {
        int[][] array = {{2,3,1,0,50,40,12,18},{23,0,10,9,8}};
        for (int i = 0;i < array.length;i++){
            for (int j = 0; j < (array[i].length - 1); j++){
                for (int k=0;k< array[i].length-j-1;k++){
                    if (array[i][k]>array[i][k+1]){
                        int temporary = array[i][k];
                        array[i][k] = array[i][k+1];
                        array[i][k+1] = temporary;
                    }
                }
            }
        }
        for (int i = 0; i< array.length;i++){
            for (int j = 0 ;j< array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
