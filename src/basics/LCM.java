package basics;

import java.util.Scanner;

//find the least common multiples of two numbers
public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNum = scanner.nextInt();
        int maxNum = Math.max(firstNum,secondNum);
        int maxMultiple = firstNum*secondNum;
        int multiple = maxNum;
        for (int i = maxNum;maxNum<=maxMultiple; i++){
            if (i%firstNum==0&&i%secondNum==0){
                multiple=i;
                break;
            }
        }
        System.out.print(multiple);
    }
}
