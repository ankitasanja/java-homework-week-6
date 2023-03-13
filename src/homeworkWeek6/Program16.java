package homeworkWeek6;

import java.util.Scanner;

/*
16. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */
public class Program16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first binary number: ");
        String x = sc.next();

        System.out.println("Enter second binary number: ");
        String y = sc.next();

        addition(x, y);


        sc.close();

    }

    //public static void addition(int binary1, int binary2) {
    public static void addition(String x, String y) {

        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(y, 2);
        int n3 = n1 + n2;

        System.out.println("n1: " + Integer.toBinaryString(n1));
        System.out.println("n2: " + Integer.toBinaryString(n2));
        System.out.println("n3=n1+n2: " + Integer.toBinaryString(n3));
    }
}
