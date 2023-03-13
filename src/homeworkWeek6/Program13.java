package homeworkWeek6;

import java.util.Scanner;

/*
13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
public class Program13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double x = in.nextDouble();
        System.out.println("Enter the second number: ");
        double y = in.nextDouble();
        System.out.println("Enter the third number: ");
        double z = in.nextDouble();
        average(x, y, z);

        in.close();
    }

    public static void average(double x, double y, double z) {
        double average = (x + y + z) / 3;
        System.out.println("average value is:" + average);
    }
}
