import java.applet.*;
import java.awt.*;
public class app6 extends Applet
{
	String a1,a2;
	int a=0,b=0;
	public void init()
	{
		a2=getParameter("ab");
		a1=getParameter("aa");
		if(a1==null)
		{
			a=2;
		}
		else
		{
			a=Integer.parseInt(a1);
		}
		if(a2==null)
		{
			b=2;
		}
		else
		{
			b=Integer.parseInt(a2);
		}
	}
	public void paint(Graphics g)
	{
		int y=0,t,z=10;
		for(int k=a;k<=b;k++)
		{
			for(int i=1;i<=10;i++)
			{
				y=y+30;
				t=k*i;
				g.drawString(""+t,z,y);
				setBackground(Color.orange);
				setForeground(Color.blue);
			}
			z=z+20;
			y=0;
		}
	}
}