import java.awt.*;
import java.awt.event.*;


//It does not use inner class
public class MousePressedDemo extends Frame
{
	String msg="";

	public MousePressedDemo()
	{
	addMouseListener(new MyMouseAdapter(this));
	addWindowListener(new MyWindowAdapter());
	}

	//Display  the mouse information
	public void paint(Graphics g)
	{
	g.drawString(msg, 20 ,100);
	}

	public static void main(String args[])
	{
	MousePressedDemo appwin = new MousePressedDemo();
		
	appwin.setSize(new Dimension(200,150));
	appwin.setTitle("MousePressedDemo");
	appwin.setVisible(true);
	}


}


class MyMouseAdapter extends MouseAdapter
{
	MousePressedDemo mousePressedDemo;
	
	public MyMouseAdapter(MousePressedDemo mousePressedDemo)
	{
	this.mousePressedDemo=mousePressedDemo;
	}

	//handle mouse pressed
	public void mouseClicked(MouseEvent me)
	{
	mousePressedDemo.msg ="Mouse pressed";
	mousePressedDemo.repaint(); //
	}
}

class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
		System.exit(0);

		}
	}

