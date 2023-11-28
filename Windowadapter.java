import java.awt.*;
import java.awt.event.*;

class Windowadapter extends Frame
{

	Windowadapter()
	{
		setSize(500,500);
		setVisible(true);

		this.addWindowListener(new WindowAdapter(){
		
		public void windowClosing(WindowEvent w)
		{System.exit(0);}
		});
	}

	public static void main(String [] args)
	{
		Windowadapter wa = new Windowadapter();	
	}
}