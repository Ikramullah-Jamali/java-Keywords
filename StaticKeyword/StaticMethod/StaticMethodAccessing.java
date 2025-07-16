// Demonstrates calling a static method and accessing a static variable

public class StaticMethodAccessing
{
    static int i = 10;

    static void display() 
    {
        System.out.println(i);
    }

    public static void main(String[] args) 
    {
        display(); // Direct static method call
    }
}
