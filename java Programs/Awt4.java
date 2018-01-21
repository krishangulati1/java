import java.awt.*;
class Awt4
{
	Frame f;
	Button b1,b2,b3;
	List l1,l2,l3;
	Choice ch;
	Awt4()
	{
		f=new Frame("Enter Try program");
		b1=new Button("font");
		b1.setBounds(100,100,150,90);
		f.add(b1);
		
		b1=new Button("Style");
		b1.setBounds(300,100,150,90);
		f.add(b1);
		
		b1=new Button("size");
		b1.setBounds(500,100,150,90);
		f.add(b1);
		
		l1=new List();
		l1.add("TimesNewRome");
		l1.setBounds(100,300,150,90);
		f.add(l1);
		
		l2=new List();
		l2.add("TimesNewRome");
		l2.setBounds(300,300,150,90);
		f.add(l2);
		
		l3=new List();
		l3.add("TimesNewRome");
		l3.setBounds(500,300,150,90);
		f.add(l3);
		
		ch=new Choice();
		ch.add("adfgh");
		ch.add("kjhg");
		ch.add("qwer");
		ch.add("zxcv");
		ch.add("lkjhnh");
		f.add(ch);
		ch.setBounds(700,600,150,90);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.red);
	}
	public static void main(String []z)
	{
		Awt4 a=new Awt4();
	}
}