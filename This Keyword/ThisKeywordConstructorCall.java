

class ThisKeywordConstructorCall
{
	 	ThisKeywordConstructorCall() // constructor
	{
		this(100);
		System.out.println("no argument constructor");
	}
		ThisKeywordConstructorCall(int a)
	{
		System.out.println("parameterized constructor");
	}
	public static void main(String [] args)
	{
		new ThisKeywordConstructorCall();
	}
}
		
	
	