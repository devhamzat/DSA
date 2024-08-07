package basics;

import java.util.Scanner;

//all divisor of a number
public class AllDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();

        int divisor;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisor = i;
                System.out.println(divisor);
            }
        }
    }
}
