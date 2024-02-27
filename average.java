class average
{
	public static void main(String args[])
	{
	double nums[]={10.1,10.2,10.3,10.4,10.5};
	double result = 0 ;
 	int i;
	
	for(i=0;i<5;i++)
	{
	result=result+nums[i];
	}

	System.out.println("Average is "+result/5);
	}
}