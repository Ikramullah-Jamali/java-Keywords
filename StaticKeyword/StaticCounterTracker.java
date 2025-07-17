

class StaticCounterTracker
{
	static int count;
	void Counter()
	{
		count ++;
		System.out.println(count);
	}
	public static void main(String [] args)
	{
		StaticCounterTracker s1=new StaticCounterTracker();
		s1.Counter();
		StaticCounterTracker s2=new StaticCounterTracker();
		s2.Counter();
		StaticCounterTracker s3=new StaticCounterTracker();
		s3.Counter();
	}
}
		
