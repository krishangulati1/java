import java.awt.*;
import java.awt.event.*;
class Awt2 implements AdjustmentListener,ActionListener
{
	Frame f;
	Button b1,b2,b3,b4,b5,b6,b7;
	Scrollbar s1,s2,s3;
	TextField t1,t2,t3;
	int a,b,d;
	int z,x,v;
	Awt2()
	{
	f=new Frame("2nd question");
	f.setLayout(null);
	b1=new Button("RED");
	b1.setBounds(50,50,150,90);
	f.add(b1);
	
	b2=new Button("GREEN");
	b2.setBounds(250,50,150,90);
	f.add(b2);
	
	b3=new Button("BLUE");
	b3.setBounds(480,50,150,90);
	f.add(b3);
	
	b4=new Button("APPLY");
	b4.setBounds(800,360,150,90);
	f.add(b4);
	
	t1=new TextField();
	t1.setBounds(50,680,150,50);
	f.add(t1);
	
	t2=new TextField();
	t2.setBounds(250,680,150,50);
	f.add(t2);
	
	t3=new TextField();
	t3.setBounds(480,680,150,50);
	f.add(t3);
	
	s1=new Scrollbar(Scrollbar.VERTICAL,100,10,0,255);
	s1.setBounds(50,150,150,500);
	f.add(s1);
	
	s2=new Scrollbar(Scrollbar.VERTICAL,100,10,0,255);
	s2.setBounds(250,150,150,500);
	f.add(s2);
	
	s3=new Scrollbar(Scrollbar.VERTICAL,100,10,0,255);
	s3.setBounds(480,150,150,500);
	f.add(s3);
	
	s1.addAdjustmentListener(this);
	s2.addAdjustmentListener(this);
	s3.addAdjustmentListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==s1)
		{
			a=s1.getValue();
			t1.setText(""+a);
		}
		if(ob==s2)
		{
			b=s2.getValue();
			t2.setText(""+b);
		}
		if(ob==s3)
		{
			d=s3.getValue();
			t3.setText(""+d);
		}
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ab=ae.getSource();
		if(ab==t1)
		{
			a=Integer.parseInt(t1.getText());
		}
		if(ab==t2)
		{
			b=Integer.parseInt(t2.getText());
		}
		if(ab==t3)
		{
			
			d=Integer.parseInt(t3.getText());
		}
		if(ab==b1)
		f.setBackground(Color.red);
		if(ab==b2)
		f.setBackground(Color.green);
		if(ab==b3)
		f.setBackground(Color.blue);
		if(ab==b4)	
		{
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			d=Integer.parseInt(t3.getText());
			Color c=new Color(a,b,d);
			f.setBackground(c);
		}
		
	}
	public static void main(String []z)
	{
		Awt2 qq=new Awt2();
	}
}