import java.awt.*;
import java.awt.event.*;

class ChatBox extends Frame implements ActionListener
{
	TextArea t1;
	TextField t2;
	Button b;
	String s1 ="";

	ChatBox()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(new GridLayout(2,1));

		Panel p1=new Panel();
		Panel p2=new Panel();

		t1=new TextArea();
		t1.setBackground(Color.GRAY);
		t1.setForeground(Color.WHITE);

		p1.add(t1);
		add(p1);

		t2=new TextField("",100);
		b=new Button("SEND");
		
		t2.setBackground(Color.BLACK);
		b.setBackground(Color.BLACK);
		t2.setForeground(Color.WHITE);
		b.setForeground(Color.WHITE);

		p2.setLayout(new FlowLayout());
		p2.add(t2);
		p2.add(b);

		add(p2);

		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b &&  t2.getText()!="")
		{
			s1=s1+(t2.getText())+"\n";
			t1.setText(s1);
			t2.setText("");
		}
	}

	public static void main(String [] args)
	{
		ChatBox cb = new ChatBox();
	}
}