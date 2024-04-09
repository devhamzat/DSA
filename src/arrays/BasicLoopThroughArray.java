package arrays;

public class BasicLoopThroughArray {
    public static void main(String[] args) {

        String[] cars = {"porsche", "volkswagon", "mercedes", "innoson", "kia", "tesla", "audi"};
        //this would loop through the array and print out each car in the array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }


        System.out.println(" ");


        String car[] = {"porsche", "volkswagon", "mercedes", "innoson", "kia", "tesla", "audi"};
        //this loop is a for each loop that does the same thing as the above loop
        for (String i : car) {
            System.out.println(i);
        }
    }
}
