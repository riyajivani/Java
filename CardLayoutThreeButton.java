import java.awt.*;
import java.awt.event.*;

class CardLayoutThreeButton extends Frame implements ActionListener
{
	Button b1,b2,b3;
	CardLayout card = new CardLayout(); 

	CardLayoutThreeButton()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(card);
		

		b1=new Button("previous");
		b2=new Button("next");
		b3=new Button("last");

		add(b1,"card1");
		add(b2,"card2");
		add(b3,"card3");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		card.next(this);
	}

	public static void main(String [] args)
	{
		CardLayoutThreeButton v=new CardLayoutThreeButton();
	}
}