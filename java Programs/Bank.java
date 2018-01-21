import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bank implements ActionListener
{
	JFrame f;
	JLabel banner,aside1,aside2,sp1,sp2,sp3;
	ImageIcon img1,img2,img3;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16;
	JToolBar tb;
	JButton jb1;
	JPanel statuspannel;
	JDesktopPane dp;
	
	Bank()
	{
		f=new JFrame("BANKING APP");
		f.setBounds(0,20,700,600);
		f.setLayout(null);
		f.setBackground(Color.red);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mb=new JMenuBar();
		mb.setBounds(10,7,1340,20);
		f.add(mb);
		
		statuspannel=new JPanel();
		statuspannel.setLayout(null);
		statuspannel.setBounds(10,650,1340,30);
		f.add(statuspannel);
		
		sp1=new JLabel("www.axisbank.com");
		sp1.setBounds(20,5,130,20);
		sp1.setBackground(Color.red);
		statuspannel.add(sp1);
		
		sp2=new JLabel("Designed by krishan");
		sp2.setBounds(200,5,130,20);
		sp2.setBackground(Color.red);
		statuspannel.add(sp2);
		
		img1=new ImageIcon("ad3.jpg");
		aside1=new JLabel("");
		aside1.setIcon(img1);
		aside1.setBounds(10,130,220,500);
		f.add(aside1);
		
		img2=new ImageIcon("ad3.jpg");
		aside2=new JLabel("");
		aside2.setIcon(img2);
		aside2.setBounds(1190,130,220,500);
		f.add(aside2);
		
		img3=new ImageIcon("Axis-Bank-Badhti-Ka-Naam-Zindagi.jpg");
		banner=new JLabel("");
		banner.setIcon(img3);
		banner.setBounds(330,60,1350,130);
		f.add(banner);
		
		m1 = new JMenu("cms");
		m1.setMnemonic(KeyEvent.VK_F);
		mb.add(m1);
		
		m2 = new JMenu("Transaction");
		mb.add(m2);
		
		m3 = new JMenu("Lone");
		mb.add(m3);
		
		m4 = new JMenu("About");
		mb.add(m4);
		
		m5 = new JMenu("Help-desk");
		mb.add(m5);
		
		mi1=new JMenuItem("new account");
		mi1.setToolTipText("this is for new account");
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
		m1.add(mi1);
		
		mi2=new JMenuItem("modify account");
		mi2.setToolTipText("modify account here");
		m1.add(mi2);
		
		mi3=new JMenuItem("dlt account");
		mi3.setToolTipText("for deletion of the account");
		m1.add(mi3);
		
		mi4=new JMenuItem("Display All-Account");
		mi4.setToolTipText("click to display all accounts");
		m1.add(mi4);
		
		mi5=new JMenuItem("Display particular acc.");
		mi5.setToolTipText("for personal accounts");
		m1.add(mi5);
		
		mi6=new JMenuItem("exit");
		mi6.setToolTipText("click to exit");
		mi6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.ALT_MASK));
		m1.add(mi6);
		
		mi7=new JMenuItem("widral");
		m2.add(mi7);
		
		mi8=new JMenuItem("Deposit");
		m2.add(mi8);
		
		mi9=new JMenuItem("Bal. Enq");
		mi9.setToolTipText("for balance-enquiery");
		m2.add(mi9);
		
		mi10=new JMenuItem("search");
		mi10.setToolTipText("for searching click here");
		m2.add(mi10);
		
		mi11=new JMenuItem("Last 10 Transaction");
		mi11.setToolTipText("for details about last 10 transactions");
		m2.add(mi11);
		
		mi12=new JMenuItem("lone type");
		m3.add(mi12);
		
		mi13=new JMenuItem("lone application form");
		m3.add(mi13);
		
		mi14=new JMenuItem("display lone acc.");
		m3.add(mi14);
		
		mi15=new JMenuItem("disp info");
		m3.add(mi15);
		
		dp=new JDesktopPane();
		dp.setLayout(null);
		dp.setBounds(250,220,850,400);
		dp.setBackground(Color.black);
		f.add(dp);
		
		tb=new JToolBar();
		tb.setBounds(10,30,1340,20);
		f.add(tb);
		
		jb1=new JButton("",new ImageIcon("ae.jpg"));
		tb.add(jb1);
		jb1.addActionListener(this);
		
		f.setVisible(true);
		f.setSize(1500,770);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Object ob =ae.getSource();
		if(ob==mi1 || ob==jb1)
		{
			JInternalFrame jif=new JInternalFrame("Account opening form",true,true,true,true);
			jif.setBounds(0,0,600,350);
			dp.add(jif);
			jif.setVisible(true);
			jif.setLayout(null);
			Mypanel mp=new Mypanel();
			mp.setBounds(0,0,600,320);
			jif.add(mp);
			
		mp.setVisible(true);
			
		}
		
	}

	public static void main(String []z)
	{
		Bank a =new Bank();
	}
}