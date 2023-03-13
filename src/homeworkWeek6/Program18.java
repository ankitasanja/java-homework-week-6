package homeworkWeek6;

import java.util.Scanner;

/*
18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        addition(num1, num2);
        int sum = addition(num1, num2);
        System.out.println(num1 + " + " + num2 + "=" + sum);

        subtraction(num1, num2);
        int sub = subtraction(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + sub);

        multiplication(num1, num2);
        int mul = multiplication(num1, num2);
        System.out.println(num1 + " x " + num2 + " = " + mul);

        division(num1, num2);
        int div = division(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + div);

        percentage(num1, num2);
        int mod = percentage(num1, num2);
        System.out.println(num1 + " % " + num2 + " = " + mod);


        sc.close();
    }

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int subtraction(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int multiplication(int a, int b) {
        int mul = a * b;
        return mul;

    }

    public static int division(int a, int b) {
        int div = a / b;
        return div;
    }

    public static int percentage(int a, int b) {
        int mod = a % b;
        return mod;

    }

}




