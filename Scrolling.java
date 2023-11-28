import java.awt.*;

class Scrolling extends Frame{
	Scrolling()
	{
		setSize(500,500);
		setVisible(true);
	
		Scrollbar sb = new Scrollbar();
		add(sb);


		ScrollPane sb1 = new ScrollPane();
		add(sb1);

	}

	public static void main(String [] args)
	{
		Scrolling s = new Scrolling();
	}
}
