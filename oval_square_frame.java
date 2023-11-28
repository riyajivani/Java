import java.awt.*;

class demo extends Frame
{
     demo()
     {
          setSize(500,500);
          setVisible(true);
          setBackground(Color.blue);    
          setForeground(Color.white);
     }
     
     public void paint(Graphics obj)
     {
		obj.drawOval(200,200,100,100);           //radius=50
        obj.drawRect(200,200,100,100);
		obj.drawLine(250,200,250,300);
		obj.drawLine(200,250,300,250);
		obj.drawLine(215,215,285,285);
		obj.drawLine(285,215,215,285);
     }
}
public class oval_square_frame
{
     public static void main(String[] args)
     {
          demo d1 = new demo();
          d1.repaint();
     }
     
}