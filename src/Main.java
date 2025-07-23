public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("DATA STRUCTURE AND ALGORITHM");
//        int w=3,y=6;
//        System.out.println(w&y);
//        System.out.println(w|y);
//        System.out.println(w^y);
//        System.out.println(~w);
//        System.out.println(w<<1);
//        System.out.println(w<<30);
//        System.out.println(y<<32);
//        System.out.println((w++) +" " + ((w--)));
//        System.out.println((5^2^5)^2);
//         w=+3;
//        System.out.println(w);
//        System.out.println(null==null);
//        int a  = -0;
//        System.out.println(a);
//        System.out.println(a^1);
//        System.out.println(args.length+5);
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime());
        System.out.println("Total memory available to JVM"+     Runtime.getRuntime().totalMemory());
//        System.out.println("Total bytes of memory used by JVM : " + Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    }
    public  final void printString(String name){
        String greeting = "hello";
        System.out.println(greeting+ name);

   }
//    public void printString(String firstName){
//        String greeting = "hello";
//        System.out.println(greeting);
//    }
}