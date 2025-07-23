package uni_assignments;

import java.util.Scanner;

public class AreaOfACircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the radius of the circle");
        int radius = scanner.nextInt();
        System.out.println("Enter the value of pi");
        double pi = scanner.nextDouble();
        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;
        System.out.println("Area of the circle is: " + area);
        System.out.println("Circumference of the circle is: " + circumference);
    }
}
