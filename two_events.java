import java.awt.*;
import java.awt.event.*;

public class two_events extends Frame implements ActionListener
{
    
    Button b1=new Button("submit");
    Button b2=new Button("clear");

    two_events()
    {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
       
       //b1.setBounds(200, 200, 250, 30); 
       //b2.setBounds(400, 400, 250, 30);

        this.add(b1);
        this.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() ==b1)
        {
            this.setBackground(Color.RED);
        }

        if(e.getSource() ==b2)
        {
            this.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {

        two_events d = new two_events();
    }
}
