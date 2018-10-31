import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=Frm height=250 width=250>
  </applet>*/
public class Frm extends Applet implements ActionListener
{
Button b1;
String n,p;
Frwnd f1;
public void init()
{
b1=new Button("window");
add(b1);
b1.addActionListener(this);
}
class Frwnd extends Frame implements ActionListener
{
Label l1,l2;
TextField t1,t2;
Button chk;
public Frwnd(String ss)
{
super(ss);
setLayout(new FlowLayout());
l1=new Label("username");
l2=new Label("password");
t1=new TextField(20);
t2=new TextField(20);
t2.setEchoChar('*');
chk=new Button("check");
add(l1);
add(t1);
add(l2);
add(t2);
chk.addActionListener(this);
add(chk);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==chk)
{
n="Name:"+t1.getText();
p="Password:"+t2.getText();
repaint();
f1.setVisible(false);
}
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
f1=new Frwnd("Login");
f1.setSize(300,300);
f1.show();
}
}
public void paint(Graphics g)
{
g.drawString(n,100,50);
g.drawString(p,100,70);
}
}

