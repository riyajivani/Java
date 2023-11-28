import java.awt.*;
import java.awt.event.*;

class IncreaseStringSize extends Frame implements ActionListener
{
	Button b;	
	int i;
	
	IncreaseStringSize()
	{
			i=0;
			setSize(500,500);
			setVisible(true);
			setLayout(new FlowLayout());
			
			b=new Button("start");
			b.addActionListener(this);
			add(b);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Riya",250,250);
		if(i==1)
		{
				Font font = new Font("Verdana", Font.BOLD, 20);
				g.setFont(font);
				g.drawString("Riya",250,250);
		}
	}
	
	public void actionPerformed(ActionEvent a)
	{
			if(a.getSource()==b)
			{
				i=1;
				repaint();
			}
	}
	
	public static void main(String [] args)
	{
		IncreaseStringSize i = new IncreaseStringSize();
	}
}