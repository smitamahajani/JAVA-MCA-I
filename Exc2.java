class Exc2
{
	public static void main(String args[])
	{

	int d,a;
	
	try
	{
	
	System.out.println("It will not print");

	d=0;
	a = 23 /d;
	System.out.println("It will not print");
	}

	catch(ArithmeticException e)
	{
	System.out.println("Division by zero");
	}

	System.out.println("After catch statement");
	}
}