package homeworkWeek6;

/*
9. Write a program to convert the upper case to lower case
 */

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character in upper case: ");
        String a = scanner.nextLine();
        alphabet(a);


        scanner.close();

    }

    public static void alphabet(String a) {

        String d = a.toLowerCase();
        System.out.println("convert the upper case to lower case: " + d);

    }
}
