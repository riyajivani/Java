import java.awt.*;
import java.awt.event.*;

public class Event extends Frame implements ActionListener 
{
    	Button b1=new Button("try");

	public Event()
	{
        setVisible(true);
     	setSize(500,500);
      	setLayout(new FlowLayout());
       	b1.addActionListener(this);
		add(b1);
	}

    public void actionPerformed(ActionEvent e)
    {
        setBackground(Color.PINK);
    }

    public static void main(String[] args) {
        
        Event e1 = new Event();
    }
}