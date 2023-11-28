import java.awt.*;
import java.awt.event.*;

class WindowMouseadapter extends Frame
{
	int m;

	WindowMouseadapter()
	{
		m=0;
		setSize(500,500);
		setVisible(true);

		this.addWindowListener(new WindowAdapter(){
		
		public void windowClosing(WindowEvent w)
		{System.exit(0);}
		});

		this.addMouseListener(new MouseAdapter(){
		
		public void mouseClicked(MouseEvent x)
		{m=1;repaint();}
		});
	}

	public void paint(Graphics g)
	{
		if(m==1)
		g.drawOval(150,150,100,100);
	}

	public static void main(String [] args)
	{
		WindowMouseadapter wa = new WindowMouseadapter();	
	}
}