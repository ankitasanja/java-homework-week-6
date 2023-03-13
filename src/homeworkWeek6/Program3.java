package homeworkWeek6;

/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme
 */
public class Program3 {

    double x = 20.5; // x is an instance variable
    static float y = 30.5f;// y is a static variable

    // This method ia an instance method
    public void method() {
        System.out.println("This is an instance method");
        System.out.println("Value of x is: " + x);

    }

    public static void myMethod() {
        System.out.println("This is a static method");
        System.out.println("Value of y is: " + y);
    }


    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.method();
        myMethod();
    }
}
