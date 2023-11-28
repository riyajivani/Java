import java.awt.*;
import java.awt.event.*;

class canvas extends Canvas
{
	int a=0;
	canvas(int t)
	{
		setSize(300,300);
		a=t;
		setBackground(Color.BLUE);
		setForeground(Color.WHITE);
	}

	public void setA(int a)
	{
		this.a=a;
	}	

	public void paint(Graphics g)
	{
		if(a==1)	
			g.drawOval(50,50,200,200);
		if(a==2)	
			g.drawRect(50,50,200,200);
		if(a==3)	
			g.drawOval(30,50,250,100);
	}
}

class DrawingInCanvas extends Frame implements ItemListener
{
	CheckboxGroup cg=new CheckboxGroup();
	Checkbox c1,c2,c3;
	canvas c=new canvas(0);

	DrawingInCanvas()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());

		c1=new Checkbox("circle",cg,false);
		c2=new Checkbox("Rectangle",cg,false);
		c3=new Checkbox("ellipse",cg,false);
		
		
		add(c1);
		add(c2);
		add(c3);
		add(c);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent i)
	{
		if(i.getSource()==c1)
		{
			c.setA(1);
		}
		if(i.getSource()==c2)
		{
			c.setA(2);
		}
		if(i.getSource()==c3)
		{
			c.setA(3);
		}
		if(i.getStateChange()==1)
		{
			c.repaint();
		}
	
	}

	public static void main(String [] args)
	{
		DrawingInCanvas d = new DrawingInCanvas();
	}
}

