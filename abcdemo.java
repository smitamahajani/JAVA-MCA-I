class abc
{
	void te()
	{
	System.out.println("No Parameters");
	}

	void te(int a, int b)
	{
	System.out.println("Two Parameters");
	System.out.println("a: " + a + " and b: " + b  );
	}

	void te(double a)
	{
	System.out.println("Inside test (double) a: " +a);
	
	}
	
}

class abcdemo
{
	public static void main(String args[])
	{
	abc x = new abc();
	int i= 88;
	
	x.te();
	
	x.te(10,20);
	
	x.te(i);
	x.te(1.1);
	
	}	
}
