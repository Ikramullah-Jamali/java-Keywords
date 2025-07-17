
class ExternalClass
{
	ExternalClass(ThisKeywordToConstructor td)
	{
		System.out.println("ExternalClass constructor called.");
	}
}
class ThisKeywordToConstructor
{
	void m1()
	{
		ExternalClass t=new ExternalClass(this);
	}
	public static void main(String [] args)
	{
		ThisKeywordToConstructor td=new ThisKeywordToConstructor();
		td.m1();
	}
}
		