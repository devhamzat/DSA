package patterns;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scanner.nextInt();
        int row = 1;
        while (row <= size) {
            int column = 1;
            while (column <= row) {
                System.out.print("*");
                column++;
            }
            row++;
            System.out.println();
        }


    }
}
