package homeworkWeek6;

import java.util.Scanner;
/*
8. Write a program to calculate the area of a triangle
 */

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the triangle: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle");
        double height = scanner.nextDouble();
        Program8 obj = new Program8();
        obj.area(base, height);

        scanner.close();

    }

    public void area(double base, double height) {
        double area = (base * height) / 2; //Area = (width*height)/2
        System.out.println("Area of Triangle is: " + area);

    }
}
