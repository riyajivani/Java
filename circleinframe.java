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
          obj.drawOval(150,150,200,200);
     }
}
public class circleinframe
{
     public static void main(String[] args)
     {
          demo d1 = new demo();
          d1.repaint();
     }
     
}