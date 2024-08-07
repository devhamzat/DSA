package patterns;

import java.util.Scanner;

public class SquareStarPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int length = sc.nextInt();
        int rows = 1;
        while (rows <= length) {
            int columns = 1;
            while (columns <= length) {
                System.out.print("*");
                columns++;
            }

            rows++;
            System.out.println();
        }
    }
}
