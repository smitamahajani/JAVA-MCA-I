class Test
{
int a;
public int b;
private int c;

//method to access c
void setc(int i)
{
c=i;
}

int getc()
{
return c;
}
}
class AccessTest
{
	public static void main(String args[])
	{
	Test ob = new Test();	
	
	ob.a=10;
	ob.b=20;
	
	//ob.c=100; //it will generate error

	ob.setc(100);

System.out.println("a,b and c are " + ob.a + "  " + ob.b  + "  "+ ob.getc());
        }
}