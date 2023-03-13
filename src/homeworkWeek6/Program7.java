package homeworkWeek6;


import java.util.Scanner;

/*
7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Program7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in degree Fahrenheit: ");
        double f = scanner.nextDouble();
        Program7 obj = new Program7();
        obj.temperature(f);


        scanner.close();

    }
    public void temperature(double f) {
        double c = 5.0 / 9.0 * (f - 32);
        System.out.println("Temperature in °C is: " + c + "°C");

    }
}
