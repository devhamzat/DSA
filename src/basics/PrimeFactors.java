package basics;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        printFactors(number);


    }

    public static boolean isPrimeTwo(int number) {
        if (number == 1) {
            return false;
        }
        for (int index = 2; index * index <= number; index++)
            if (number % index == 0)
                return false;


        return true;

    }

    public static void printFactors(int number) {
        for (int i = 2; i < number; i++) {
            if (isPrimeTwo(i) == true) {
                int k = i;
                while ((number % k == 0)) {
                    System.out.print(i + " ");
                    k = k * i;
                }
            }
        }
    }
}
