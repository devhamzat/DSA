package basics;

import java.util.Scanner;

//find the greatest common divisor of two numbers;
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNum = scanner.nextInt();
        int smallNum;
        if (firstNum > secondNum) {
            smallNum = secondNum;
        } else {
            smallNum = firstNum;
        }
        int divisor = 0;
        for (int i = 1; i <= smallNum; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                divisor = i;
            }
        }
        System.out.println(divisor);
    }
}
