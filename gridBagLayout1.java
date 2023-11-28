import java.awt.*;

class gridBagLayout1 extends Frame
{

	gridBagLayout1()
	{
		setSize(500,500);
		setVisible(true);

		setLayout(new GridBagLayout());
		
		Label l1=new Label("Name");
		TextField t1 = new TextField();
		Label l2=new Label("Adress");
		TextArea t2 = new TextArea(6,15);

		GridBagConstraints gc=new GridBagConstraints();

		add(l1,gc,0,0,1,1,0,0);
		add(t1,gc,1,0,1,1,0,10);
		add(l2,gc,0,1,1,1,0,0);
		add(t2,gc,1,1,1,1,0,20);
	}
	
	public void add(Component comp, GridBagConstraints gc, int x, int y, int w, int h, int wx, int wy)
	{
		gc.gridx=x;
		gc.gridy=y;
		gc.gridwidth=w;
		gc.gridheight=h;
		gc.weightx=wx;
		gc.weighty=wy;
		add(comp,gc);
	}	

	public static void main(String [] args)
	{
		gridBagLayout1 gbl = new gridBagLayout1();
	}
}