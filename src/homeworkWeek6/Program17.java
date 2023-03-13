package homeworkWeek6;

import java.util.Scanner;

/*
17. Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101

 */
public class Program17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num = sc.nextInt();


        String str = Integer.toBinaryString(num);
        System.out.println("Binary value: " + num + " is "+ str);

        sc.close();
    }

}