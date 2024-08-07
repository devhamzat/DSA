package patterns;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();

        for (int numRows = 1; numRows <= size; numRows++) {
            for (int numStars = 1; numStars <= numRows; numStars++) {
                System.out.print("* ");
            }

            for (int spaces = 1; spaces <= size - numRows; spaces++) {
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
