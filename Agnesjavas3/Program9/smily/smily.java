import java.awt.*;
import java.applet.*;
/*   <applet code="smily" width=300 height=100>
 *    *    
 *     *   </applet>
 *      *   */
public class smily extends Applet
{
	public void paint(Graphics g)
	{
		Font f=new Font ("Helvetica",Font.BOLD,20);
		g.setFont(f);
		g.drawString("Keep smiling",50,30);
		g.drawOval(60,60,200,200);
		g.fillOval(90,120,50,20);
		g.fillOval(190,120,50,20);
		g.drawLine(165,135,165,175);
		g.drawArc(115,130,95,95,0,-180);
	}
}
