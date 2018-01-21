import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Notepad
{
	JFrame f;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16;
	JToolBar tb;
	JButton b1,b2,b3,b4;
	JTextArea a;
	Notepad()
	{
		f=new JFrame("Untitled_Notepad");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mb=new JMenuBar();
		f.setJMenuBar(mb);
		m1=new JMenu("file");
		m1.setMnemonic(KeyEvent.VK_F);
		mb.add(m1);
		m2=new JMenu("edit");
		mb.add(m2);
		m3=new JMenu("format");
		mb.add(m3);
		m4=new JMenu("view");
		mb.add(m4);
		m5=new JMenu("help");
		mb.add(m5);
		
		mi1=new JMenuItem("new",new ImageIcon("Play.jpg"));
		mi1.setToolTipText("this is for new file");
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
		m1.add(mi1);
		
		mi2=new JMenuItem("open");
		mi2.setToolTipText("this is for opening the file");
		m1.add(mi2);
		
		mi3=new JMenuItem("save");
		mi3.setToolTipText("this is for saving the file");
		m1.add(mi3);
		
		mi4=new JMenuItem("page Setup..");
		m1.add(mi4);
		
		mi5=new JMenuItem("Print..");
		m1.add(mi5);
		
		mi6=new JMenuItem("exit");
		mi6.setToolTipText("this is for exiting from the file");
		mi6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.ALT_MASK));
		m1.add(mi6);
		
		mi7=new JMenuItem("undo");
		mi7.setToolTipText("this is for undoing");
		mi7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,Event.CTRL_MASK));
		m2.add(mi7);
		mi8=new JMenuItem("cut");
		mi8.setToolTipText("this is for cutting the text");
		mi8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,Event.CTRL_MASK));
		m2.add(mi8);
		mi9=new JMenuItem("copy");
		mi9.setToolTipText("this is for copying the text");
		mi9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,Event.CTRL_MASK));
		m2.add(mi9);
		mi10=new JMenuItem("paste");
		mi10.setToolTipText("this is for pasting the text");
		mi10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,Event.CTRL_MASK));
		m2.add(mi10);
		mi11=new JMenuItem("delete");
		mi11.setToolTipText("this is for deleting");
		m2.add(mi11);
		mi12=new JMenuItem("find");
		m2.add(mi12);
		
		mi13=new JMenuItem("word wap");
		m3.add(mi13);
		mi14=new JMenuItem("status bar");
		m4.add(mi14);
		mi14=new JMenuItem("view help");
		m5.add(mi14);
		mi15=new JMenuItem("about notepad");
		m5.add(mi15);
		
		f.setLayout(null);
		tb=new JToolBar();
		tb.setBounds(10,5,1300,20);
		f.add(tb);
		
		b1=new JButton("",new ImageIcon("ae.jpg"));
		tb.add(b1);
		
		a=new JTextArea();
		a.setBounds(05,30,1354,1200);
		f.add(a);
		
		f.setSize(800,800);
		f.setVisible(true);
	}
	public static void main(String []z)
	{
		Notepad a=new Notepad();
	}
}