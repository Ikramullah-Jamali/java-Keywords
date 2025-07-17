

class Base
{
	void m1()
	{
		System.out.println("I am in method m1 (Base) .");
	}
}
class SuperMethodCall extends Base
{
	 void m1()
	{
		System.out.println("I am in Method m1 (Derived) .");
	} 
	void show()
	{
		m1();
		super.m1(); //this is also use of super keyword
	}
	public static void main(String [] args)
	{	
		SuperMethodCall s=new SuperMethodCall();
		s.show();
	}
}