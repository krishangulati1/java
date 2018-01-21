import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Awt6 implements AdjustmentListener
{
	Frame f;
	Label l1;
	Scrollbar s1;
	int a,b;
	Awt6()
	{
		f=new Frame("My program");
		f.setLayout(null);
		l1=new Label("EMULATION");
		
		l1.setBounds(500,300,100,100);
		f.add(l1);
		
		s1=new Scrollbar(Scrollbar.HORIZONTAL,100,10,0,255);
		s1.setBounds(20,700,1200,50);
		f.add(s1);
		
		s1.addAdjustmentListener(this);
		
		f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		Object ab=ae.getSource();
		if(ab==s1)
		{
		int a=s1.getValue();
		l1.setBounds(a,300,100,100);
		f.add(l1);
		}
	}
	public static void main(String[]z)
	{
		Awt6 a=new Awt6();
	}
}