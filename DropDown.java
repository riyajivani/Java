import java.awt.*;

class DropDown extends Frame
{
	DropDown()
	{
		setSize(500,500);
		setVisible(true);
		
		Label l=new Label("choice");
		add(l);

		Choice c = new Choice();

		c.add("pts");
		c.add("ddc");
		c.add("dsa");
		c.add("oopj");
		c.add("etc");

		add(c);
	}

	public static void main(String [] args)
	{
		DropDown d = new DropDown();
	}
}