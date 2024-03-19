package fibonnacci;

//this is fibonacci series using recursion
public class FibonacciNumbersRecursionIMPL {

    int count=2;
    public int fibonacci(int num1, int num2){
        if (count<=19){
            int fibonacciNumbers = num1+num2;
            System.out.println(fibonacciNumbers);
            num1=num2;
            num2=fibonacciNumbers;
            count+=1;
            fibonacci(num1,num2);
        }
        return 3;
    }
    public static void main(String[] args) {

        System.out.println(0);
        System.out.println(1);
        FibonacciNumbersRecursionIMPL method = new FibonacciNumbersRecursionIMPL();
        method.fibonacci(0,1);


    }
}
