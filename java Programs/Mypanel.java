import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mypanel extends Panel implements ActionListener
{
	JButton b1,b2,b3;
	Mypanel()
	{
		setLayout(null);
		b1=new JButton("Red");
		b1.setBounds(10,10,70,30);
		add(b1);
		
		b2=new JButton("Blue");
		b2.setBounds(100,10,70,30);
		add(b2);
	
		b3=new JButton("Green");
		b3.setBounds(190,10,70,30);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==b1)
		{
			setBackground(Color.red);
		}
		if(ob==b2)
		{
			setBackground(Color.blue);
		}
		if(ob==b3)
		{
			setBackground(Color.green);
		}
	
	}
}
