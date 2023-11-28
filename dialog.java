import java.awt.*;
import java.awt.event.*;

class dialog
{
	Dialog d;

	dialog()
	{
		Frame f=new Frame();

		d = new Dialog(f,"login",true);
		d.setLayout(new GridLayout(6,1));

		Button b = new Button("login");
		TextField t1=new TextField();
		TextField p=new TextField();
		p.setEchoChar('*');
		TextField t2=new TextField();
		Label l1=new Label("Enter name");
		Label l2=new Label("Enter password");

		d.add(l1);
		d.add(t1);
		d.add(l2);
		d.add(p);
		d.add(b);
		d.add(t2);

		 b.addActionListener( new ActionListener()  
        {  
           	public void actionPerformed( ActionEvent a )  
            {  
                if(a.getSource()==b)
				{
					String s = p.getText();

					if(s.equals("sem-3"))
						t2.setText("login sucessfully");
					else
						t2.setText("enter correct password");
				}
            }  
        }); 

		d.addWindowListener( new WindowAdapter()  
        		{  
           			public void windowClosing( WindowEvent w)  
            		{System.exit(0);}  
        		}); 

		d.setSize(500,300);    
        d.setVisible(true); 
	}

	public static void main(String [] args)
	{
		dialog d1 = new dialog();
	}
} 