class Box
{
	double width;
	double height;
	double depth;

	Box() //It is constructor 
	{
	System.out.println("Constructing box");
	width=40;
	height=50;
	depth=60;
	}
	
	double volume1()
	{
	return width*height*depth;
	}

	
}

class BoxDemo6
{
	public static  void main(String args[])
	{
	//declare allocate and initialize Box objects
	Box mybox1 = new Box();

	double vol;

	vol=mybox1.volume1();
	System.out.println("Volume is "+vol);
	}
}