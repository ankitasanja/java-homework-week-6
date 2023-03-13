package homeworkWeek6;

import java.util.Scanner;

/*
6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)
 */

public class Program6 {
    public static void method(double r) {
        double area = (3.14 * r * r);
        System.out.println("Enter area of the circle is: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = scanner.nextDouble();

        method(radius);

        scanner.close();

    }
}
