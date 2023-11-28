import java.awt.*;
import java.awt.event.*;

public class checkbox_colour extends Frame implements ItemListener
{
    
    Checkbox b1=new Checkbox("red");
    Checkbox b2=new Checkbox("green");
    Checkbox b3=new Checkbox("blue");

    checkbox_colour()
    {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        this.add(b1);
        this.add(b2);
        this.add(b3);

        b1.addItemListener(this);
        b2.addItemListener(this);
        b3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() ==b1)
        {
            this.setBackground(Color.RED);
        }

        else if(e.getSource() ==b2)
        {
            this.setBackground(Color.GREEN);
        }

        else if(e.getSource() ==b3)
        {
            this.setBackground(Color.BLUE);
        }

        else if(e.getSource() ==b3)
       {
           this.setBackground(Color.WHITE);
       }
    }

    public static void main(String[] args) {

        checkbox_colour d = new checkbox_colour();
    }
}
