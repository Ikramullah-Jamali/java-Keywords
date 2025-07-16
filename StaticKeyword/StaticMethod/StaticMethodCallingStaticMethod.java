
// Demonstrates how a static method can call another static method

public class StaticMethodCallingStaticMethod 
{
    static int i = 10;

    static void display() 
    {
        System.out.println(i);
        show(); //  Valid: both methods are static
    }

    static void show() 
    {
        System.out.println("20");
    }

    public static void main(String[] args) 
    {
        display();
    }

    /*
     Original Error Version:
    void show() 
    {
        System.out.println("20");
    }
    // Error: Cannot call non-static method 'show()' from static context 'display()'
    */
}
