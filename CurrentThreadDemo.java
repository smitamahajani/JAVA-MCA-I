class CurrentThreadDemo
{
	public static void main(String args[])
	{
	Thread t = Thread.currentThread();

	System.out.println("Current thread : "+t);
	t.setName("My Thread");
	System.out.println("After name change : "+t);
	}
}