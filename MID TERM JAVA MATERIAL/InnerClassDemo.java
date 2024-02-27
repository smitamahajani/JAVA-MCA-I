class Outer
{
	int outer_x = 100;
	
	void test()
	{
	Inner inner = new Inner();
	inner.Display();
	}

	class Inner
	{
	void Display()
	{
	System.out.println(outer_x);
	}
	}
}

class InnerClassDemo
{
	public static void main(String args[])
	{
	Outer outer = new Outer();
	outer.test();
	}
}