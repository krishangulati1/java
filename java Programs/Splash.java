import java.awt.Color;
import javax.swing.*;

class Splash
{
	JFrame f;
	JProgressBar pb;
	JLabel l1,l2,l3,l4,jl3;
	ImageIcon img1;
	Splash()
	{
		f=new JFrame();
		f.setLayout(null);
		f.setBounds(0,20,700,600);
		f.setBackground(Color.red);
		
		img1=new ImageIcon("images.jpg");
		l4=new JLabel("");
		l4.setIcon(img1);
		l4.setBounds(360,10,1350,430);
		f.add(l4);
		
		pb = new JProgressBar(1,100);
		pb.setBounds(10,560,1340,10);
		pb.setBackground(Color.BLACK);
		f.add(pb);
		
		l1=new JLabel("LODING....");
		l1.setBounds(10,590,100,30);
		f.add(l1);
		
		l2=new JLabel("www.axisindia.com");
		l2.setBounds(10,620,100,30);
		f.add(l2);
		
		l3=new JLabel("SGNR Branch");
		l3.setBounds(600,590,100,100);
		f.add(l3);
		
		f.setSize(1500,770);
		f.setVisible(true);
		
		for(int i=1;i<=100;i=i+5)
		{
			try
			{
				Thread.sleep(300);
				pb.setValue(i);
				switch(i%4)
				{
				
				case 0:
					jl3.setText(".");
					break;
				case 1:
					jl3.setText("..");
					break;
				case 2:
					jl3.setText("...");
					break;
				case 3:
					jl3.setText("....");
					break;
				case 4:
					jl3.setText(".....");
					break;
				}
			}
			catch(Exception e)
			{}
		}
		f.setVisible(false);
		f.setResizable(true);
		
		Bank a =new Bank();
	}
	public static void main(String []z)
	{
		Splash a= new Splash();
	}
}