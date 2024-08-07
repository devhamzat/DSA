package basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        PrimeNumber primeNumber = new PrimeNumber();
//        System.out.println(primeNumber.isPrime(number));
        System.out.println(primeNumber.isPrimeTwo(number));


        //  the naive way
//        int count = 0;
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                count++;
//                if (count > 2) {
//                    break;
//                }
//            }
//        }
//        if (count > 2) {
//            System.out.println(number + " is not a prime number");
//        } else {
//            System.out.println(number + " is  a prime number");
//        }
    }

    //    efficient method
    boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int index = 2; index * index <= number; index++)
            if (number % index == 0)
                return false;


        return true;
    }

    //    further optimization
    boolean isPrimeTwo(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true ;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int index = 5; index * index <= number; index = index + 6) {
            if (number % index == 0 || number % (index + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
