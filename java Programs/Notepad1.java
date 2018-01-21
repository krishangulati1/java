import java.awt.*;
class Notepad1
{
Frame f;
MenuBar mb;
Menu m1,m2,m3,m4,m5;
MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18;
TextArea ta;
Notepad1()
{
f=new Frame("Untitled-Notepad");
f.setSize(800,800);
f.setVisible(true);
mb=new MenuBar();
m1=new Menu("File");
mb.add(m1);
m2=new Menu("edit");
mb.add(m2);
m3=new Menu("format");
mb.add(m3);
m4=new Menu("view");
mb.add(m4);
m5=new Menu("help");
mb.add(m5);
mi1=new MenuItem("file");
m1.add(mi1);
mi2=new MenuItem("open");
m1.add(mi2);
mi3=new MenuItem("save");
m1.add(mi3);
mi4=new MenuItem("page setup");
m1.add(mi4);
mi5=new MenuItem("EXIT");
m1.add(mi5);
mi6=new MenuItem("undo");
m2.add(mi6);
mi7=new MenuItem("cut");
m2.add(mi7);
mi8=new MenuItem("copy");
m2.add(mi8);
mi9=new MenuItem("paste");
m2.add(mi9);
mi10=new MenuItem("delete");
m2.add(mi10);
mi11=new MenuItem("find");
m2.add(mi11);
mi12=new MenuItem("find next");
m2.add(mi12);
mi13=new MenuItem("replace");
m2.add(mi13);
mi14=new MenuItem("word wrap");
m3.add(mi14);
mi15=new MenuItem("font");
m3.add(mi15);
mi16=new MenuItem("status bar");
m4.add(mi16);
mi17=new MenuItem("view help");
m5.add(mi17);
mi18=new MenuItem("About Notepad");
m5.add(mi18);
ta=new TextArea();
f.add(ta);
f.setMenuBar(mb);
}
public static void main(String[]z)
{
Notepad1 N=new Notepad1();
}
}