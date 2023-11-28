import java.awt.*;
import java.awt.event.*;

class mouse_colour extends Frame implements MouseListener
{
	mouse_colour()
	{
		setVisible(true);
		setSize(500,500);
		addMouseListener(this);	
	}

	public void mouseClicked(MouseEvent e){ setBackground(Color.RED); }

	public void mouseEntered(MouseEvent e){ setBackground(Color.GREEN); }
	
	public void mouseExited(MouseEvent e){ setBackground(Color.BLUE); }
	
	public void mousePressed(MouseEvent e){}
	
	public void mouseReleased(MouseEvent e){}

	public static void main(String [] args)
	{
		mouse_colour m = new mouse_colour();
	}
}