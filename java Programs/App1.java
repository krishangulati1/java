import java.applet.*;
import java.awt.*;
public class App1 extends Applet
{
	public void init()
	{
		setBackground(Color.green);
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello applet",10,10);
		g.setColor(Color.black);
		g.drawString("Krishan",10,100);
		g.setFont(new Font("timesnewroman",Font.BOLD,20));
		g.drawString("GULATI",10,150);
		g.drawLine(10,10,100,10);
		g.drawRect(100,100,100,100);
		g.fillRect(100,10,150,100);
		g.drawOval(10,210,200,90);
		g.fillOval(10,210,200,90);
		g.draw3DRect(100,200,100,100,true);
		int x[]={10,200,300,50,10};
		int y[]={10,100,150,250,150};
		g.drawPolygon(x,y,x.length);
		g.fillPolygon(x,y,x.lenght);
	}
}