class Box
{
	double width;
	double height;
	double depth;

	Box(double w , double h,double d) //It is constructor 
	{
	System.out.println("Constructing box");
	width=w;
	height=h;
	depth=d;
	}
	
	double volume1()
	{
	
	return width*height*depth;
	}

	
}

class BoxDemo7
{
	public static  void main(String args[])
	{
	Box mybox1 = new Box(1,4,7);
	Box mybox2 = new Box(3,8,2);

	double vol;

	vol=mybox1.volume1();
	System.out.println("Volume is "+vol);

	vol=mybox2.volume1();
	System.out.println("Volume is "+vol);


	
	}
}