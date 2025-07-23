package recursion;

public class PrintNToOne {
    static void method(int number){
        if (number==0){
            return;
        }
        System.out.print(number + " ");
        method(number-1);

    }

    public static void main(String[] args) {
        method(10);
    }
}
