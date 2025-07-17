

class SuperBase
{
	 SuperBase()
	{
		System.out.println("I am in Constructor of SuperBase.");
	}
}
class SuperConstructorCall extends SuperBase
{
	 SuperConstructorCall()
	{
		super();   /* if you dont use super() then 
		              output is same bcz compiler give super() by own */
					 
		System.out.println("I am in constructor of SubClass.");
	} 
	public static void main(String [] args)
	{	
		new SuperConstructorCall(); 
	}
}