package basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int i = 1;
        for (int j = number ; j>0; j--){
            i = i*j;
        }

        System.out.println(i);
    }
}
