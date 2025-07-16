
// Demonstrates accessing an instance variable from a static method using an object

public class StaticMethodAccessingInstanceVariable 
{
    int i = 10;

    static void display() 
    {
        StaticMethodAccessingInstanceVariable obj = new StaticMethodAccessingInstanceVariable();
        System.out.println(obj.i); //  Access through object
    }

    public static void main(String[] args) 
    {
        display();
    }

    /*
     Original Error Version:
    static void display() {
        System.out.println(this.i);
    }
    // Error: Cannot use 'this' in a static context
    */
}
