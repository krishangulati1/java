import java.applet.*;
import java.awt.*;
public class app4 extends Applet
{
	String a=null;
	public void init()
	{
		a=getParameter("aa");
		if(a==null)
		{
			a="EMULATION";
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(a,10,10);
	}
}