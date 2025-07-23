package recursion;

// this class is printing one to N in a tail recursive way
public class TailRecursion {
    static void method(int number, int start) {
        if (number == 0) {
            return;
        }
//        start variable should be initialized to one
        System.out.print(start + " ");
        method(number - 1, start + 1);

    }

    public static void main(String[] args) {
        method(10, 5);
    }
}
