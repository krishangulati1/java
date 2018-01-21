import java.applet.*;
import java.awt.*;
public class app5 extends Applet
{
	String a1;
	int a=0;
	public void init()
	{
		a1=getParameter("aa");
		if(a1==null)
		{
			a=2;
		}
		else
		{
			a=Integer.parseInt(a1);
		}
	}
	public void paint(Graphics g)
	{
		int y=0,t;
		for(int i=1;i<=10;i++)
		{
			y=y+30;
			t=a*i;
			g.drawString(""+t,10,y);
			setBackground(Color.orange);
			setForeground(Color.blue);
		}
	}
}