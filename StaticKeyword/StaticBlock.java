

class StaticBlock
{
	static
	{
		// This block runs before the main method
		System.out.println("Hello");
	}
	public static void main(String [] args)
	{
		System.out.println("I am in main method");
	}
}
