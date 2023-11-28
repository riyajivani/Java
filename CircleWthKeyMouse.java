import java.awt.*;
import java.awt.event.*;

class CircleWthKeyMouse extends Frame
{
	int x=150;
	int y=150;
	int i;

	CircleWthKeyMouse()
	{
		setSize(500,500);
		setVisible(true);

		addKeyListener(new KeyAdapter()
		{
		public void keyPressed(KeyEvent k)
		{
			if(k.getKeyCode()==KeyEvent.VK_UP)	
			{
				y=y-10;
				repaint();
			}
			else if(k.getKeyCode()==KeyEvent.VK_DOWN)
			{
				y=y+10;
				repaint();
			}
			else if(k.getKeyCode()==KeyEvent.VK_LEFT)
			{
				x=x-10;
				repaint();
			}
			else if(k.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				x=x+10;
				repaint();
			}
		}
		});

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

		public void paint(Graphics g)
		{
			g.drawOval(x,y,100,100);
		}

		public static void main(String [] args)
		{
			CircleWthKeyMouse s = new CircleWthKeyMouse();	
		}
}
