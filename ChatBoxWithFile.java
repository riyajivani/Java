import java.awt.*;
import java.io.*;
import java.awt.event.*;

class ChatBoxWithFile extends Frame implements ActionListener 
{
	TextArea t1;
	TextField t2;
	Button b;

	ChatBoxWithFile()
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
		b=new Button("VIEW");
		
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
		try{
			if(a.getSource()==b &&  t2.getText()!="")
			{
				String s = "D:\\sem-3\\java\\book\\ForFiles\\";
				String s1=s+(t2.getText());
				//File f=new File("D:\\sem-3\\java\\book\\ForFiles\\t2.getText()");
				
				File f = new File(s1);
				BufferedReader br = new BufferedReader(new FileReader(f));
				String st;
				
				while((st=br.readLine())!=null)
				{
					t1.setText(st);
					t2.setText("");
				}
			}
		}catch(Exception e){}
	}

	public static void main(String [] args)
	{
		ChatBoxWithFile cb = new ChatBoxWithFile();
	}
}