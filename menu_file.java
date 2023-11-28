import java.awt.*;
import java.awt.event.*;

class menu_file extends Frame implements ActionListener
{
	MenuBar mb = new MenuBar();
	Menu m1 = new Menu("File");
	MenuItem i1 = new MenuItem("new");
	MenuItem i2 = new MenuItem("open");
	MenuItem i3 = new MenuItem("save as");
	int i;

	menu_file()
	{
		setSize(500,500);
		setVisible(true);

		this.setMenuBar(mb);
		mb.add(m1);
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
	}

	public void paint(Graphics g)
	{
		if(i==1)
			g.drawString("hello",250,250);
		if(i==2)
			g.drawString("hiii",250,250);
		if(i==3)	
			g.drawString("byy",250,250);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i1)
		{
			i=1;
			repaint();
		}
		if(e.getSource()==i2)
		{
			i=2;
			repaint();
		}
		if(e.getSource()==i3)
		{
			i=3;
			repaint();
		}
	}

	public static void main(String [] args)
	{
		menu_file M = new menu_file();
	}
}