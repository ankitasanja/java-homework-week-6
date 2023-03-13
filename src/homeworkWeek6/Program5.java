package homeworkWeek6;

/*
5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {
    public static void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two numbers is: " + ans);
    }

    public static void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction of two number is: " + ans);
    }

    public void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Multiplication of two number is: " + ans);
    }

    public void division(int a, int b) {
        int ans = a / b;
        System.out.println("Division of two number is: " + ans);
    }

    public static void main(String[] args) {
        Program5 obj = new Program5();
        addition(10, 20);
        subtraction(60, 10);
        obj.multiplication(25, 2);
        obj.division(30, 5);

    }
}
