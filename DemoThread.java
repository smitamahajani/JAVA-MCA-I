class A extends Thread 
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
		//Try with 10,50,100
		System.out.println("Hii");
		try
		{
		Thread.sleep(10);
		}
		catch(InterruptedException e)
		{
		
		}
		}
	}
}

class B extends Thread 
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
		System.out.println("Hello");
		}
	}
}

public class DemoThread
{
	public static void main(String args[])
	{
	A obj1 = new A();
	B obj2 = new B();
	
	//To get the priority of the thread
	//System.out.println(obj1.getPriority());
	
	//obj2.setPriority(Thread.MAX_PRIORITY);
	//System.out.println(obj2.getPriority());
	
	obj1.start();
	
	obj2.start();
	}
}