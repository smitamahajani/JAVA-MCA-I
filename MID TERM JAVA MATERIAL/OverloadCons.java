class let
{
	double width;
	double height;
	double depth;

	let(double w,double h,double d)
	{
	width = w;
	height = h;
	depth = d;	
	}

	let()
	{
	width = -1;
	height = -1;
	depth = -1;
	}

	let(double len)
	{
	width=height=depth=len;
	}

	double volume()
	{
	return width*height*depth;
	}
}
class OverloadCons
{
	public static void main(String args[])
	{
	let mybox1 = new let(10,20,15);
	let mybox2 = new let();
	let mycube = new let(7);

	double vol;
	
	//get volume of first box
	vol = mybox1.volume();
	System.out.println("Volume of mybox1 is" +vol);

	//get volume of second box
	vol = mybox2.volume();
	System.out.println("Volume of mybox2 is" +vol);

	//get volume of cube
	vol = mycube.volume();
	System.out.println("Volume of mycube is" +vol);
	}
	
} 















