import java.awt.*;

class panel extends Frame
{
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox c1,c2,c3,r1,r2;
	Choice c;
	Button b,b1,b2,b3,b4,b5,b6;

	panel()
	{
		setSize(500,500);
		setVisible(true);
	
		setLayout(new BorderLayout());

		r1=new Checkbox("red",cg,false);
		r2=new Checkbox("green",cg,false);

		c1=new Checkbox("A");
		c2=new Checkbox("B");
		c3=new Checkbox("C");

		c = new Choice();
		c.add("pts");
		c.add("ddc");
		c.add("dsa");
		c.add("oopj");
		c.add("etc");

		b=new Button("Submit");

		Panel  p1=new Panel();

		p1.add(r1);
		p1.add(r2);
		add(p1,BorderLayout.NORTH);	

		Panel  p2=new Panel();
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		add(p2,BorderLayout.EAST);
		
		Panel  p3=new Panel();
		p3.add(b);
		add(p3,BorderLayout.SOUTH); 
		
		Panel  p4=new Panel();
		p4.add(c);
		add(p4,BorderLayout.WEST);

		b1=new Button();b1.setBackground(Color.RED);
		b2=new Button();b2.setBackground(Color.GREEN);
		b3=new Button();b3.setBackground(Color.YELLOW);
		b4=new Button();b4.setBackground(Color.PINK);
		b5=new Button();b5.setBackground(Color.BLUE);
		b6=new Button();b6.setBackground(Color.CYAN);
		
		Panel p5=new Panel();
		p5.setLayout(new GridLayout(3,2,20,20));
		p5.add(b1);
		p5.add(b2);
		p5.add(b3);
		p5.add(b4);
		p5.add(b5);
		p5.add(b6);
		add(p5,BorderLayout.CENTER);
	}

	public static void main(String [] args)
	{
		panel pa = new panel();
	}
}