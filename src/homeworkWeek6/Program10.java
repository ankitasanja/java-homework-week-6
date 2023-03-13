package homeworkWeek6;

import java.util.Scanner;

/*
10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int table = scanner.nextInt();
        Program10 obj = new Program10();
        obj.multiplication(table = 8);


        scanner.close();
    }

    public void multiplication(int table) {

        System.out.println("8x1= " + 1 * table);
        System.out.println("8x2= " + 2 * table);
        System.out.println("8x3= " + 3 * table);
        System.out.println("8x4= " + 4 * table);
        System.out.println("8x5= " + 5 * table);
        System.out.println("8x6= " + 6 * table);
        System.out.println("8x7= " + 7 * table);
        System.out.println("8x8= " + 8 * table);
        System.out.println("8x9= " + 9 * table);
        System.out.println("8x10= " + 10 * table);

    }

}
