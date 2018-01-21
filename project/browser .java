import awt.event.*;
import javax.swing.*;
class bowser extends JFrame 
{
	JTextField t1 ;
	JEditorPane e1;
	bowser()
	{
		setTITLE("SIMPLE WED BROWSER ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("");
		t1= new JTextField("Enter file url here ");
		t1.addActionListner(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				setThePage(ae.getActioncommand);
			}
		});
		add(t1,BorderLayout.NORTH);
		e1=new JEditorPane();
		e1.setEditable(false);
		e1.addHyperlinkListner(new HyperlinkListner()
		{
			public void hyperlinkUpdate(HyperlinkEvent he)
			{
				if(he.getEventtype()==HyperlinkEvent.EventType.ACTIVATED)
				{
						setThePage(he.getURL().toString());
					 add (new JScrollPane(e1),BorderLayout.CENTER);
					 setSize(400,300);
					 setVisible(true);
					 
				}
			}
		});
	}
	void setThePage(String a)
	{
		try
		{
			e1.setPage(a);
			t1.setText(a);
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		
	}
	public static  void  main(String[]z)
		{
			new bowser();
			
		}
}