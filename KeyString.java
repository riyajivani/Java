import java.awt.*;
import java.awt.event.*;

class KeyString extends Frame implements KeyListener
{
	int x=150;
	int y=150;

	KeyString()
	{
		setSize(500,500);
		setVisible(true);
		addKeyListener(this);
	}

		public void keyPressed(KeyEvent k)
		{
			if(k.getKeyCode()==KeyEvent.VK_UP)	
			{
				y=y-10;
			}
			else if(k.getKeyCode()==KeyEvent.VK_DOWN)
			{
				y=y+10;
			}
			else if(k.getKeyCode()==KeyEvent.VK_LEFT)
			{
				x=x-10;
			}
			else if(k.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				x=x+10;
			}
			else
			{
				x=x;
				y=y;
			}

			repaint();
		}
		public void keyReleased(KeyEvent k){}
		public void keyTyped(KeyEvent k){}

		public void paint(Graphics g)
		{
			g.drawString("RIYA",x,y);
		}

		public static void main(String [] args)
		{
			KeyString ks = new KeyString();	
		}
}