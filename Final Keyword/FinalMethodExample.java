

class A1
{
	final void show()  
	{
		System.out.println("I am in class A1");
	}
}

class FinalMethodExample extends A1
{
	/*  void show()   // we cannot override show() method,bcz it is final method
	{
		System.out.println("i am in class Final Method");
	}  */
	public static void main(String [] args)
	{
		FinalMethodExample f=new FinalMethodExample();
		f.show();
	}
}