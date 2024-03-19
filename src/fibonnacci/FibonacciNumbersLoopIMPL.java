package fibonnacci;

//this is a fibonacci series using loops
public class FibonacciNumbersLoopIMPL {
    public static void main(String[] args) {
//        this prints out the first 22 fibonacci numbers
        int num1=0;
        int num2=1;
        System.out.println(num1);
        System.out.println(num2);

        for (int i =0; i<20; i++){
            int fibonacciNumbers= num1+num2;
            System.out.println(fibonacciNumbers);
            num1=num2;
            num2=fibonacciNumbers;
        }
    }

}
