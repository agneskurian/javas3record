import java.awt.*;
import java.applet.*;
/*   <applet code="scroll" width=400 height=300>
     </applet>
*/     
public class scroll extends Applet implements Runnable
{
	int x=0;
	Thread t;
	public void init()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<500;i++,x++)
		{
			repaint();
			try
			{
				t.sleep(50);
			}
catch(InterruptedException e)
{

}
		}
	}

public void paint(Graphics g)
{
	Font f=new Font("Arial",Font.BOLD,20);
	g.setFont(f);
	g.drawString("Welcome to Applets",x,25);
}
}

