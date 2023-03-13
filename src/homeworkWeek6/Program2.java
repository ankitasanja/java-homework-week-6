package homeworkWeek6;

/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme
 */
public class Program2 {

    static int a = 20; // a is static variable
    static double b = 30.5; // b is static variable

    // This method is a static method
    public static void method() {
        System.out.println("This is a static method");
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }

    // Main method is a static method
    public static void main(String[] args) {

        method();
    }
}

