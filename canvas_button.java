import java.awt.*; 
import java.awt.event.*;

class canvas_button extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Canvas cn;

	canvas_button()
	{
		setVisible(true);
		setSize(300,300);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		b1=new Button("red");
		add(b1);

		b2=new Button("green");
		add(b2);

		b3=new Button("blue");
		add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		cn=new Canvas();
		cn.setSize(100,100);
		add(cn);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			cn.setBackground(Color.RED);

		if(e.getSource()==b2)
			cn.setBackground(Color.GREEN);

		if(e.getSource()==b3)
			cn.setBackground(Color.BLUE);
	}

	public static void main(String [] args)
	{
		canvas_button c =new canvas_button();
	}
}