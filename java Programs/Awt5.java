import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Awt5 implements AdjustmentListener
{
	Frame f;
	JLabel j1;
	ImageIcon img1;
	Scrollbar s1,s2;
	int a,b;
	Awt5()
	{
		f=new Frame("My program");
		f.setLayout(null);
		img1=new ImageIcon("aa.jpg");
		j1=new JLabel("");
		j1.setIcon(img1);
		j1.setBounds(0,0,300,300);
		f.add(j1);
		
		s1=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
		s1.setBounds(0,700,1200,50);
		f.add(s1);
		
		s2=new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
		s2.setBounds(1300,50,50,600);
		f.add(s2);
		
		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		
		f.setSize(2000,1600);
		
		
		f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		Object ab=ae.getSource();
		if(ab==s1)
		{
		int a=s1.getValue();
		int b=s2.getValue();
		j1.setBounds(a,b,300,300);
		f.add(j1);
		}
		if(ab==s2)
		{
		int a=s1.getValue();
		int b=s2.getValue();
		j1.setBounds(a,b,300,300);
		f.add(j1);
		}
	}
	public static void main(String[]z)
	{
		Awt5 a=new Awt5();
	}
}