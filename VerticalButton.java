import java.awt.*;

class VerticalButton extends Frame
{
	Button b1,b2,b3,b4,b5,b6;

	VerticalButton()
	{
		setSize(500,500);
		setVisible(true);

		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");

		setLayout(null);
	
		b1.setBounds(100,100,40,20);
		b2.setBounds(100,150,40,20);
		b3.setBounds(100,200,40,20);
		b4.setBounds(100,250,40,20);
		b5.setBounds(100,300,40,20);
		b6.setBounds(100,350,40,20);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}

	public static void main(String [] args)
	{
		VerticalButton v=new VerticalButton();
	}
}