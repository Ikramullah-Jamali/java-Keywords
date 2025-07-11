

final class A
{
	void display() 
	{
        System.out.println("This is class A, and it's final.");
  }
}

class FinalClassExample  // We cannot extend class A because it is declared as final.

{
	public static void main(String [] args)
	{
		    A obj = new A();
        obj.display();
		    System.out.println("hello");
	}
}
