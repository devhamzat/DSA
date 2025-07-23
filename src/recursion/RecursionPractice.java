package recursion;

public class RecursionPractice {
    static void method1(int number) {
        if (number == 0) {
            return;
        }
        System.out.println(number);
        method1(number - 1);


    }

    static int method2(int number) {
        if (number == 1) {
            return 0;
        }

        return 1 + method2(number / 2);


    }


    public static void main(String[] args) {
//        method1(10);
        method2(6);
    }
}
