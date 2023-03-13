package homeworkWeek6;

import java.util.Scanner;

/*
15. Write a Java program to swap two variables.
 */
public class Program15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int num1 = s.nextInt();

        System.out.println("Enter value of b: ");
        int num2 = s.nextInt();

        Program15 obj = new Program15();
        obj.swapVariables(num1, num2);
        obj.swapVariables(num2, num1);

        System.out.println("Swapped value of a: " + obj.swapVariables(num1, num2));
        System.out.println("Swapped value of b: " + obj.swapVariables(num2, num1));

        s.close();
    }

    public int swapVariables(int a, int b) {
        a = b;
        b = a;
        int ans = a;
        return ans;
    }
}
