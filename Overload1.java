class OverloadDemo1
{
	void test1()
	{
	System.out.println("No Parameters");
	}

	void test1(int a, int b)
	{
	System.out.println("Two Parameters");
	System.out.println("a: " + a + " and b: " + b  );
	}

	void test1(double a)
	{
	System.out.println("Inside test (double) a: " +a);
	
	}
	
}

class Overload1
{
	public static void main(String args[])
	{
	OverloadDemo x = new OverloadDemo();
	int i= 88;
	
	x.test1();
	
	x.test1(10,20);
	
	x.test1(i);
	x.test1(1.1);
	
	}	
}
