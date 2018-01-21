import java.applet.*;
import java.awt.*;
public class app7 extends Applet
{
	int a;
	public void init()
	{
	a=Integer.parseInt(getParameter("aa"));
	}
	
	public void paint(Graphics g)
	{
		int q=0,w=0;
		for(int r=1;r<=a;r++)
		{
			for(int c=1;c<=a;c++)
			{
				q=q+30;
				g.drawRect(q,w,30,30);
				if(r%2!=0)
				{
					if(c%2!=0)
					{
						g.fillRect(q,w,30,30);
					}
				}
				else
				{
					if(c%2==0)
					{
						g.fillRect(q,w,30,30);
					}
				}
			}
			w+=30;
			q=0;
		}
	}
}