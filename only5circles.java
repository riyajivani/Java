import java.awt.*;
import java.awt.event.*;

class only5circles extends Frame
{
	int x=150;
	int y=150;
	int i;

	only5circles()
	{
		i=1;
		setSize(500,500);
		setVisible(true);

		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent m)
			{
				int cx=m.getX();
				int cy=m.getY();
				Graphics g = getGraphics();
				g.drawOval(cx,cy,10,10);	
			}
		});
	}
		public static void main(String [] args)
		{
			only5circles s = new only5circles();	
		}
}
