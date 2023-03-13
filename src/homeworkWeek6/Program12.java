package homeworkWeek6;

import java.util.Scanner;

/*
12. Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Program12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        double a = s.nextDouble();
        System.out.println("Enter the number");
        double b = s.nextDouble();
        System.out.println("Enter the number");
        double c = s.nextDouble();
        System.out.println("Enter the number");
        double d = s.nextDouble();

        myMethod(a,b,c,d);

        s.close();

    }
    public static void myMethod(double a,double b,double c,double d){
        double number1 = ((a * b - b * b) / (c - d));
        System.out.println("Expected output: " + number1);
    }

}
