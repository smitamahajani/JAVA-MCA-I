

class BoxDemo3
{
	public static  void main(String args[])
	{
	Box mybox1 = new Box();
	Box mybox2 = new Box();

	mybox1.width=40;
	mybox1.height=50;
	mybox1.depth=60;

	mybox2.width=1;
	mybox2.height=2;
	mybox2.depth=3;

	mybox1.volume();
	mybox2.volume();

	mybox1.volume1();
	mybox2.volume1();


	
	}
}

class Box
{
	double width;
	double height;
	double depth;

	void volume()
	{
	System.out.println("Volume is " + (width*height*depth));
	
	}
	
	double volume1()
	{
	
	return width*height*depth;
	}

	
}