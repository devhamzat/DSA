package arrays.arrayBasics;


public class LowestValueInArray {
    //create a variable and set it to the first value of the array
    //go through every element in the array
    //if the current element has a lower value than the value in the variable, update the variable to this value
    //After looking at all elements in the array, the variable now contains the lowest value
    public static void main(String[] args) {
        int[] array = {7, 342, 34, 57, 1, 60, 2, 20, 30, 40, 100, 0};
        int lowestValue = array[0];
        for (int i : array) {
            if (i < lowestValue) {
                lowestValue = i;
            }
        }
        System.out.println("Lowest value: " + lowestValue);
    }
}
