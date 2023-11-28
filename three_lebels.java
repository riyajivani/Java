import java.awt.*;
import java.awt.event.*;

public class three_lebels extends Frame implements ActionListener
{
    
	Label l1,l2;
	Button b1;
	TextField t1,t2,t3;

     three_lebels()
    {
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setBackground(Color.BLUE);
		this.setForeground(Color.BLACK);
       
		l1=new Label("1st number");
		//l1.setBounds(300,250,20,10);
		add(l1);

		t1=new TextField();
		//t1.setBounds(400,250,30,20);
		add(t1);

        l2=new Label("2nd number");
		//l2.setBounds(300,300,20,10);
		add(l2);

		t2=new TextField();
		//t2.setBounds(400,300,30,20);
		add(t2);

		b1=new Button("Add");
		//b1.setBounds(300,350,20,10);
		add(b1);

		b1.addActionListener(this);

		t3=new TextField("answer is...");
		//t2.setBounds(400,350,30,20);
		add(t3);
        
    }

    public void actionPerformed(ActionEvent e)
    {
		try{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());

			int z=x+y;
	
			String s = Integer.toString(z);

			if(e.getSource()==b1)
			{
				t3.setText(s);
			}
		}catch(Exception a){}
    }

    public static void main(String[] args) {

        three_lebels d = new three_lebels();
    }
}
