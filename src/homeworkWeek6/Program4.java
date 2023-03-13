package homeworkWeek6;

/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme
 */

public class Program4 {
    char a = 'Y'; // a is an instance variable
    char b = 'J'; // b is also instance variable
    static boolean myResult = true; // myResult is a static variable
    static boolean yourResult = false; // yourResult is a static variable

    public void method() {
        System.out.println("This is an instance method");
        System.out.println("Value of a is: " + a);
        System.out.println("Value od b is: " + b);
    }

    public static void myMethod() {
        System.out.println("This is a static method");
        System.out.println("Value of myResult is: " + myResult);
        System.out.println("Value of yourResult is: " + yourResult);
    }

    public static void main(String[] args) {
        Program4 obj = new Program4();
        Program4 obj1 = new Program4();
        obj.method();
        myMethod();
    }
}
