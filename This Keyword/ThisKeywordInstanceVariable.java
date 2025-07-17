

class InstanceHolder
{
	int i; // instance variable
	void setValue(int i)
	{
		this.i=i;// this keyword refers to instance variable 
	}
	void display()
	{
		System.out.println(i);
	}
}

class ThisKeywordInstanceVariable
{
	public static void main(String [] args)
	{
		InstanceHolder t=new InstanceHolder();
		t.setValue(10);
		t.display();
	}
}