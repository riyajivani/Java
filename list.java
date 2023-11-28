import java.awt.*;

public class list extends Frame
{
	list()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(null);

		List l1=new List(5);

		l1.setBounds(200,200,50,50);

		l1.add("pts");
		l1.add("ddc");
		l1.add("dsa");
		l1.add("oopj");
		l1.add("etc");

		add(l1);
	}
	

	public static void main(String [] args)
	{
		list d = new list();
	}
}