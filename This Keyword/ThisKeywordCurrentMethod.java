
class ThisKeywordCurrentMethod
{
	void display()
	{
		System.out.println("Hello");
	}
	void show()
	{
		this.display(); // here you can also write display(); with out 'this' keyword
	}
	public static void main(String [] args)
	{
		ThisKeywordCurrentMethod t=new ThisKeywordCurrentMethod();
		t.show();
	}
}