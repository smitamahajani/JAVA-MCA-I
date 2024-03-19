import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame
{
	String msg=" ";

	public AdapterDemo()
	{
	addMouseListener(new MyMouseAdapter(this));
	addMouseMotionListener(new MyMouseAdapter(this));

	addWindowListener(new MyWindowAdapter());


	}

	//Display  the mouse information
	public void paint(Graphics g)
	{
	g.drawString(msg, 20 ,80);
	}

	public static void main(String args[])
	{
	AdapterDemo appwin = new AdapterDemo();
	
	appwin.setSize(new Dimension(200,150));
	appwin.setTitle("AdapterDemo");
	appwin.setVisible(true);
	}



}

//Handle only mouse click and drag events.
class MyMouseAdapter extends MouseAdapter
{
	AdapterDemo adapterDemo;
	
	public MyMouseAdapter(AdapterDemo adapterDemo)
	{
	this.adapterDemo=adapterDemo;
	}

	//handle mouse clicked
	public void mouseClicked(MouseEvent me)
	{
	adapterDemo.msg ="Mouse clicked";
	adapterDemo.repaint(); //
	}

	//handle mouse dragged
	public void mouseDragged(MouseEvent me)
	{
	adapterDemo.msg ="Mouse Dragged";
	adapterDemo.repaint(); //
	}

	

}

	class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
		System.exit(0);

		}
	}