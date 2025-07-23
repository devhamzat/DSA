package recursion;
//this  class converts decimal numbers to binary

public class DecimalToBinary {
//    for number >0
    static void method(int number) {
        if (number == 0) {
            return;
        }
        method(number / 2);
        System.out.print(number % 2);
    }

    public static void main(String[] args) {
        method(10);
    }
}
