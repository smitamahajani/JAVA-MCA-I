class A extends Thread
{
    public void run()
    {
        try
		{
            for(int i=0;i<=5;i++)
            {
            System.out.println("HEllo A" );
            }
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
       
    }
}

class B extends Thread
{
    
    public void run()
    {
        try
		{
        
        for(int i=0;i<=100;i++)
        {
        System.out.println("HEllo B");
        }
        
		
		}
		catch(Exception e)
		{
            System.out.println(e);
		}
       
    }
}

class C extends Thread
{
    
    public void run()
    {
        try
		{
        
        for(int i=0;i<=100;i++)
        {
        System.out.println("HEllo C");
        }
        
		
		}
		catch(Exception e)
		{
            System.out.println(e);
		}
       
    }
}



class DemoJoin1
{
    public static void main(String args[])
    {
       
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        
        t1.start();
        try {
           
            t1.join();
        } 
        catch (Exception e)
         {
           
            System.out.println(e);
        }
        t2.start();
        t3.start();
       
    }
}