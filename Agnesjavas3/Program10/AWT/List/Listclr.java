import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
      <applet code="Listclr" width=300 height=180>
      </applet>
*/
public class Listclr extends Applet implements ActionListener
{
	Dimension d;	
	List  col;
	String msg = "";
	String s="";
	int f;
	public void init()
	{
		col = new List(4, false);
		col.add("Green");
		col.add("Yellow");
		col.add("Blue");
		col.select(1);
		add(col);
		col.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
 	{
		String cmd=ae.getActionCommand(); 
		if(cmd.equals("Yellow"))
		{
			f=0;
		}
		else if(cmd.equals("Blue"))
		{
			f=1;
		}
		else
		{
			f=2;
		}
		repaint();
	}
	public void paint(Graphics g) 
	{
		int idx[];
		d = getSize();
		if(f==0)
			setBackground(Color.yellow);
		else if(f==1)
			setBackground(Color.blue);
		else
			setBackground(Color.green);
	}
}








