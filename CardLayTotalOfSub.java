import java.awt.*;
import java.awt.event.*;

public class CardLayTotalOfSub extends Frame implements ActionListener
{
	Label name,roll_no,oopj,dsa,ddc,total_of_sub,grade;
	TextField t1,t2,t3,t4,t5,tt1,tt2,tt3,tt4,tt5,ttt1,ttt2;
	Button b1,b2;

	CardLayout card = new CardLayout();	

	CardLayTotalOfSub()
	{
		setSize(500,500);
		setVisible(true);
		setLayout(card);
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(6,2));

		name=new Label("name");
		roll_no=new Label("roll_no");
		oopj=new Label("oopj");
		dsa=new Label("dsa");
		ddc=new Label("ddc");

		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();	
		t5=new TextField();
		
		b1=new Button("submit");

		p1.add(name); 
		p1.add(t1);
		p1.add(roll_no);	
		p1.add(t2);
		p1.add(oopj); 
		p1.add(t3);
		p1.add(dsa);
		p1.add(t4);
		p1.add(ddc); 
		p1.add(t5);
		p1.add(b1);           
		b1.addActionListener(this);

		add(p1,"card1");

		tt1=new TextField();
		tt2=new TextField();
		tt3=new TextField();
		tt4=new TextField();	
		tt5=new TextField();
		b2=new Button("total");

		Panel p2=new Panel();
		p2.setLayout(new GridLayout(6,1));

		p2.add(tt1);
		p2.add(tt2);
		p2.add(tt3);
		p2.add(tt4);
		p2.add(tt5);
		p2.add(b2);
		b2.addActionListener(this);

		add(p2,"card2");

		total_of_sub=new Label("total_of_sub");
		grade=new Label("grade");

		ttt1=new TextField();
		ttt2=new TextField();
		
		Panel p3=new Panel();
		p3.setLayout(new FlowLayout());

		p3.add(total_of_sub);
		p3.add(ttt1);
		p3.add(grade);
		p3.add(ttt2);
	
		add(p3,"card3");
	}

	public void actionPerformed(ActionEvent a)
	{
		String s1=t1.getText();
		int r=Integer.parseInt(t2.getText());
		int o=Integer.parseInt(t3.getText());
		int ds=Integer.parseInt(t4.getText());
		int dc=Integer.parseInt(t5.getText());
		int sum=0;
		sum=o+ds+dc;
		int avg=sum/3;
		
		String grades=new String();

		if(avg>90 && avg<=100)
			grades="A";

		else if(avg>80 && avg<=90)
			grades="B";

		else if(avg>70 && avg<=80)
			grades="C";

		else if(avg>60 && avg<=70)
			grades="D";

		else
			grades="E";
		
		if(a.getSource()==b1)
		{
			card.next(this);
			tt1.setText("NAME is  :  " +s1);
			tt2.setText("ROLL NUMBER is  :  " +Integer.toString(r));
			tt3.setText("MARK OF OOPJ is  :  " +Integer.toString(o));
			tt4.setText("MARK OF DSA is  :  " +Integer.toString(ds));
			tt5.setText("MARK OF DDC is  :  " +Integer.toString(dc));
		}

		if(a.getSource()==b2)
		{
			card.next(this);
			ttt1.setText(Integer.toString(sum));
			ttt2.setText(grades);
		}

	}

	public static void main(String [] args)
	{
		CardLayTotalOfSub cltos = new CardLayTotalOfSub();
	}
}