

class Finallyblock
{
	public static void main(String [] args)
	{
		try
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught: "+e);
		}
		finally
		{
			System.out.println("I am in finally block");
		}
	}
}