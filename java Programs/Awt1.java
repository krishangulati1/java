import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Awt1 implements ActionListener
{
Frame f;
Label l1,l2,l3;
Button b1,b2,b3,b4,b5,b6;
TextField t1,t2,t3;
ImageIcon img1;
JLabel j1;
Awt1()
{
f=new Frame("My first programm");
Color c=new Color(110,150,200);
img1=new ImageIcon("aa.jpg");
j1=new JLabel("");
j1.setIcon(img1);
j1.setBounds(10,20,800,480);
f.add(j1);
f.setBackground(c);
f.setLayout(null);
f.setSize(800,600);
f.setVisible(true);
l1=new Label("Enter first num");
l1.setBounds(10,510,150,20);
l2=new Label("Enter second num");
l2.setBounds(10,540,150,20);
l3=new Label("your answer =");
l3.setBounds(10,570,150,20);
f.add(l1);
f.add(l2);
f.add(l3);
t1=new TextField();
t1.setBounds(200,510,170,26);
f.add(t1);
t2=new TextField();
t2.setBounds(200,540,170,26);
f.add(t2);
t3=new TextField();
t3.setBounds(200,570,170,26);
f.add(t3);

b1=new Button("Clear");
b1.setBounds(500,510,70,20);
f.add(b1);
b2=new Button("end");
b2.setBounds(500,540,70,20);
f.add(b2);
b3=new Button("add");
b3.setBounds(10,600,70,20);
f.add(b3);
b4=new Button("sub");
b4.setBounds(90,600,70,20);
f.add(b4);
b5=new Button("multi");
b5.setBounds(170,600,70,20);
f.add(b5);
b6=new Button("divide");
b6.setBounds(250,600,70,20);
f.add(b6);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	Object ab=ae.getSource();
	if(ab==b1)
	{
		t1.setText("");
		t2.setText("");
		t3.setText("");
	}
	if(ab==b2)
	{
		JOptionPane.showMessageDialog(null,"thanks for visiting","EMULATION",0);
	}
	if(ab==b3)
	{
		int a,b,s;
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		s=a+b;
		t3.setText(""+s);
	}
	if(ab==b4)
	{
		int d,e,f;
		d=Integer.parseInt(t1.getText());
		e=Integer.parseInt(t2.getText());
		f=d-e;
		t3.setText(""+f);
	}
	if(ab==b5)
	{
		int d,e,f;
		d=Integer.parseInt(t1.getText());
		e=Integer.parseInt(t2.getText());
		f=d*e;
		t3.setText(""+f);
	}
	if(ab==b6)
	{
		int d,e,f;
		d=Integer.parseInt(t1.getText());
		e=Integer.parseInt(t2.getText());
		f=d/e;
		t3.setText(""+f);
	}
}
public static void main(String []z)
{
Awt1 a=new Awt1();
}
}