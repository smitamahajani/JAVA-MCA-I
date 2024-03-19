import java.awt.*;
import java.awt.event.*;

public class InnerClassDemoGUI extends Frame
{
	String msg="";

	public InnerClassDemoGUI()
	{
	addMouseListener(new MyMouseAdapter());
	addWindowListener(new MyWindowAdapter());
	}

	//Inner class to handle mouse press event
	class MyMouseAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent me)
		{
		msg="Mouse Pressed";	
		repaint();
		}
	}

	//Inner class to handle window close events
	class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
		System.exit(0);

		}
	}

	//Display  the mouse information
	public void paint(Graphics g)
	{
	g.drawString(msg, 20 ,80);
	}

	public static void main(String args[])
	{
	InnerClassDemoGUI appwin = new InnerClassDemoGUI();
	
	appwin.setSize(new Dimension(200,150));
	appwin.setTitle("Inner Class Demo");
	appwin.setVisible(true);

	}

}