

class SharedStaticVariableExample
{
	int emp_id;
	String emp_name;
	static String company=" Jamali Software house.";
	void Employee(int emp_id,String emp_name)
	{
		System.out.println(emp_id+"  "+emp_name+"  "+company);
	}
	public static void main(String [] args)
	{
		SharedStaticVariableExample s1=new SharedStaticVariableExample();
		s1.Employee(101,"farhan");
		SharedStaticVariableExample s2=new SharedStaticVariableExample();
		s2.Employee(102,"khan");
		SharedStaticVariableExample s3=new SharedStaticVariableExample();
		s3.Employee(103,"Ikram");
	}
}