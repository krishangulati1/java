import java.awt.*;
import java.awt.event.*;
class Awt7
{
	Frame f;
	MenuBar mb;
	Menu m1,m2,m3,m4,m5;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16;
	TextArea a;
	Awt7()
	{
		f=new Frame("Untitled_Notepad");
		mb=new MenuBar();
		f.setMenuBar(mb);
		m1=new Menu("file");
		mb.add(m1);
		m2=new Menu("edit");
		mb.add(m2);
		m3=new Menu("format");
		mb.add(m3);
		m4=new Menu("view");
		mb.add(m4);
		m5=new Menu("help");
		mb.add(m5);
		
		mi1=new MenuItem("new");
		m1.add(mi1);
		mi2=new MenuItem("open");
		m1.add(mi2);
		mi3=new MenuItem("save");
		m1.add(mi3);
		mi4=new MenuItem("page Setup..");
		m1.add(mi4);
		mi5=new MenuItem("Print..");
		m1.add(mi5);
		mi6=new MenuItem("exit");
		m1.add(mi6);
		
		mi7=new MenuItem("undo");
		m2.add(mi7);
		mi8=new MenuItem("cut");
		m2.add(mi8);
		mi9=new MenuItem("copy");
		m2.add(mi9);
		mi10=new MenuItem("paste");
		m2.add(mi10);
		mi11=new MenuItem("delete");
		m2.add(mi11);
		mi12=new MenuItem("find");
		m2.add(mi12);
		
		mi13=new MenuItem("word wap");
		m3.add(mi13);
		mi14=new MenuItem("status bar");
		m4.add(mi14);
		mi14=new MenuItem("view help");
		m5.add(mi14);
		mi15=new MenuItem("about notepad");
		m5.add(mi15);
		
		a=new TextArea();
		f.add(a);
		
		f.setSize(800,800);
		f.setVisible(true);
	}
	public static void main(String []z)
	{
		Awt7 a=new Awt7();
	}
}