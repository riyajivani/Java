import java.awt.*;
import java.awt.event.*;

public class window_rectangle extends Frame implements WindowListener
{
	int cnt;

	window_rectangle()
	{
		setSize(500,500);
		setVisible(true);
		addWindowListener(this);
		setLayout(new FlowLayout());
		setBackground(Color.BLUE);
		setForeground(Color.WHITE);
		cnt=0;
	}

	public void paint(Graphics g)
	{
		if(cnt==0)
		g.drawRect(200,200,100,100);

		if(cnt==1)
		g.drawOval(200,200,100,100);
	}

	public void windowOpened(WindowEvent e){ repaint(); }
	public void windowClosed(WindowEvent e){}
	public void windowActivated(WindowEvent e){ cnt=1; repaint();}
	public void windowDeactivated(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowClosing(WindowEvent e){dispose();}

	public static void main(String [] args)
	{
		window_rectangle w = new window_rectangle();
	}
}