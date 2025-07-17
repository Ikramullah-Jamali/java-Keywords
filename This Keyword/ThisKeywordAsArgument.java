

class ThisKeywordAsArgument
{
	void m1(ThisKeywordAsArgument t)
	{
		System.out.println("I am in m1 method ");
	}
	void m2()
	{
		m1(this);
	}
	public static void main(String [] args)
	{
		ThisKeywordAsArgument t=new ThisKeywordAsArgument();
		t.m2();
	}
}
