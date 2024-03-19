public class DemoDaemonThread extends Thread
{
	String s;
	public DemoDaemonThread(String name)
	{
		s=name;
	}

	public void run()
	{
		// Checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(s + " is Daemon Thread");
		}
		
		else
		{
			System.out.println(s + " is User Thread");
		}
	}
	
	public static void main(String[] args)
	{
	
		DemoDaemonThread thread1 = new DemoDaemonThread("thread1");
		DemoDaemonThread thread2 = new DemoDaemonThread("thread2");
		DemoDaemonThread thread3 = new DemoDaemonThread("thread3");
	
		
		thread1.setDaemon(true);// set user thread1 to Daemon
			
		
		thread1.start();// starting thread1
		thread2.start();// starting thread2

		thread3.setDaemon(true);// set user thread1 to Daemon
		thread3.start();// starting thread3		
	}
}

