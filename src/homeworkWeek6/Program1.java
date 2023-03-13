package homeworkWeek6;

/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1 {
    // Scope - within class
    int a = 20; // a is an instance variable or global variable
    float b = 40.5f; // b is a instance or global variable

    // method is instance method
    public void method() {
        System.out.println("This is an instance method");
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

    }

    // Main method is a static method
    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.method();
    }
}















