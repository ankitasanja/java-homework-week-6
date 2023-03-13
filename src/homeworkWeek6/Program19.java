package homeworkWeek6;

import java.util.Scanner;

/*
19. Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog
 */
public class Program19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();

        Program19 obj = new Program19();
        obj.lowercase(line);

        scanner.close();
    }

    public void lowercase(String line) {
        String d = line.toLowerCase();
        System.out.println("Convert a string into lowercase:  " + d);
    }
}
