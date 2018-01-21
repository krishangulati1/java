import java.awt.*;
import java.awt.event.*;
class Awt3 implements ActionListener
{
	Frame f;
	Button b1,b2,b3;
	Awt3()
	{
		f=new Frame("Backgroundchange");
		f.setLayout(null);
		b1=new Button("RED");
		b1.setBounds(100,300,200,100);
		f.add(b1);
		
		b2=new Button("GREEN");
		b2.setBounds(300,300,200,100);
		f.add(b2);
		
		b3=new Button("BLUE");
		b3.setBounds(500,300,200,100);
		f.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.setSize(800,600);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ab=ae.getSource();
		if(ab==b1)
		f.setBackground(Color.red);
		if(ab==b2)
		f.setBackground(Color.green);
		if(ab==b3)
		f.setBackground(Color.blue);
	}
	public static void main(String []z)
	{
		Awt3 A=new Awt3();
	}
}