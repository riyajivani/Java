import java.awt.*;
import java.awt.event.*;

class canvas extends Canvas
{
	int a;

	canvas(int t)
	{
		a=0;
		setSize(300,300);
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
	}
}

class CircleCanvas extends Frame implements ActionListener
{
	Button b;
	canvas c=new canvas(0);

	CircleCanvas()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(new FlowLayout());

		b=new Button("circle");
		
		add(b);
		add(c);

		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent i)
	{
		if(i.getSource()==b)
		{
			c.setA(1);
			c.repaint();
		}
	}

	public static void main(String [] args)
	{
		CircleCanvas c = new CircleCanvas();
	}
}

