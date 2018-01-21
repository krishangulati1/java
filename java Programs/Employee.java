import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Employee implements ActionListener
{
	Frame f;
	Label l1,l2,l3,l4,l5;
	Button b1,b7,b2,b3,b4,b5,b6;	
	TextField t1,t2,t3,t4,t5;
	Connection con;
	Statement st;
	ResultSet rs;
	
	
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emulation","root","");
		
			st=con.createStatement();
			JOptionPane.showMessageDialog(null,"connected","EMULATION",0);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e,"",0);
		}
	}

		Employee()
		{
		
			f=new Frame("12334");
			Color c=new Color(200,200,100);
			f.setBackground(c);
			f.setLayout(null);
			
			l1=new Label("Enter Employee number");
			l1.setBounds(50,50,160,30);
			f.add(l1);
			
			l2=new Label("Enter Employee name");
			l2.setBounds(50,80,160,30);
			f.add(l2);
			
			l3=new Label("Enter Employee Designation");
			l3.setBounds(50,110,160,30);
			f.add(l3);
			
			l4=new Label("Enter Employee Department");
			l4.setBounds(50,140,160,30);
			f.add(l4);
			
			l5=new Label("Enter Employee Salary");
			l5.setBounds(50,170,160,30);
			f.add(l5);
			
			b1=new Button("add");
			b1.setBounds(600,50,60,20);
			f.add(b1);
			
			b2=new Button("clear");
			b2.setBounds(600,80,60,20);
			f.add(b2);
			
			b3=new Button("end");
			b3.setBounds(600,110,60,20);
			f.add(b3);
			
			b4=new Button("show all");
			b4.setBounds(600,140,60,20);
			f.add(b4);
			
			b5=new Button("search");
			b5.setBounds(600,170,60,20);
			f.add(b5);
			
			b6=new Button("find");
			b6.setBounds(600,200,60,20);
			f.add(b6);
			
			b7=new Button("find&delete");
			b7.setBounds(600,230,60,20);
			f.add(b7);
			
			t1=new TextField();
			t1.setBounds(250,50,300,25);
			f.add(t1);
			
			t2=new TextField();
			t2.setBounds(250,80,300,25);
			f.add(t2);
			
			t3=new TextField();
			t3.setBounds(250,110,300,25);
			f.add(t3);
			
			t4=new TextField();
			t4.setBounds(250,140,300,25);
			f.add(t4);
			
			t5=new TextField();
			t5.setBounds(250,170,300,25);
			f.add(t5);
			
			t1.setEnabled(false);
			t2.setEnabled(false);
			t3.setEnabled(false);
			t4.setEnabled(false);
			t5.setEnabled(false);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			
			f.setSize(800,600);
			f.setVisible(true);
		}

		public void actionPerformed(ActionEvent ae)
		{
			Object ob=ae.getSource();
			
			//for button b4
			
			if(ob==b4)
			{
				String [][]d=new String[20][5];
				String []h={"Employee number","Employee name","Emploee Designation","Employee Depatrtment","Employee Salary"};
				try
				{
					rs=st.executeQuery("select * from employee");
					int r=0;
					while(rs.next())
					{
						d[r][0]=rs.getString("e_num");
						d[r][1]=rs.getString("e_name");
						d[r][2]=rs.getString("e_desig");
						d[r][3]=rs.getString("e_depart");
						d[r][4]=rs.getString("e_sal");
						r++;
					}
					JTable tb=new JTable(d,h);
					JScrollPane sp=new JScrollPane(tb);
					sp.setBounds(10,400,900,900);
					f.add(sp);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
			//for button b1
			
			if(ob==b1)
			{
				if(b1.getLabel().equals("add"))
				{
					t1.setEnabled(true);
					t2.setEnabled(true);
					t3.setEnabled(true);
					t4.setEnabled(true);
					t5.setEnabled(true);
					t1.requestFocus();
					b1.setLabel("save");
				}
				else
				{
					int a1,a5;
					String a2,a3,a4;
					
					a1=Integer.parseInt(t1.getText());
					a2=t2.getText();
					a3=t3.getText();
					a4=t4.getText();
					a5=Integer.parseInt(t5.getText());
					
					try
					{
						st.execute("insert into employee value("+a1+",'"+a2+"','"+a3+"','"+a4+"',"+a5+")");
						JOptionPane.showMessageDialog(null,"Saved","",0);
						
						t1.setEnabled(false);
						t2.setEnabled(false);
						t3.setEnabled(false);
						t4.setEnabled(false);
						t5.setEnabled(false);
						b1.setLabel("add");
						
						
						
					}
					
					catch(Exception e)
					{
						System.out.println("Exeption Catched");
					}
				}
			}
			
			//for button b2
			
			if(ob==b2)
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(null,"CLEARED","emulation",0);
			}
			
			//for button b3
			
			if(ob==b3)
			{
				JOptionPane.showMessageDialog(null,"Thanks for visiting","Emulation",0);
				System.exit(0);
			}
			
			//for button b5
			
			if(ob==b5)
			{
				String s=JOptionPane.showInputDialog(null,"Enter employee number you wanna search","",0);
				try
				{
					rs=st.executeQuery("select * from employee");
					boolean flag=false;
					while(rs.next())
					{
						if(rs.getString("e_num").equals(s))
						{
							t1.setText(s);
							t2.setText(rs.getString("e_name"));
							t3.setText(rs.getString("e_desig"));
							t4.setText(rs.getString("e_depart"));
							t5.setText(rs.getString("e_sal"));
							flag=true;
							break;
						}
					}
					if(flag==false)
					{
						JOptionPane.showMessageDialog(null,"Msg not Found","",0);
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"error found","",0);
				}
			}
			
			//for button b7
			
			if(ob==b7)
			{
				try
				{
					int s=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Employee number","",0));
					rs=st.executeQuery("select * from employee where e_num="+s+"");
					if(rs.next())
					{
						String z="";
						z=z+"name is = "+rs.getString("e_name");
						z=z+"\ndesignation is = "+rs.getString("e_desig");
						z=z+"\ndepartment is = "+rs.getString("e_depart");
						z=z+"\nsalary is = "+rs.getString("e_sal");
						
						int y=JOptionPane.showConfirmDialog(null,z+"\nDo u wanna Delete","",0);
						
						if(y==0)
						{
							st.executeUpdate("delete from employee where e_num="+s+"");
							JOptionPane.showMessageDialog(null,"DELETED","",0);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Not Found","",0);
						}
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Execption Found","",0);
				}
			}
			if(ob==b6)
			{
				if(b6.getLabel().equals("find"))
				{
					int s=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter employee number","",0));
					try
					{
						rs=st.executeQuery("select * from employee where e_num="+s+"");
						if(rs.next())
						{
							t1.setText(rs.getString("e_num"));
							t2.setText(rs.getString("e_name"));
							t3.setText(rs.getString("e_depart"));
							t4.setText(rs.getString("e_desig"));
							t5.setText(rs.getString("e_sal"));
							t2.setEnabled(true);
							t3.setEnabled(true);
							t4.setEnabled(true);
							t5.setEnabled(true);
							t2.requestFocus();
							b6.setLabel("update");
							JOptionPane.showMessageDialog(null,"found if u wanna update press on update","",0);	
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Not found","",0);
						}
						
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,"ERROR","",0);
					}
				}
				else
				{
					try
					{
						st.executeUpdate("update employee set e_name='"+t2.getText()+"',e_desig='"+t3.getText()+"',e_depart='"+t4.getText()+"',e_sal="+Integer.parseInt(t5.getText())+" where e_num="+Integer.parseInt(t1.getText())+"");
						JOptionPane.showMessageDialog(null,"updated","",0);
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
						t1.setEnabled(false);
						t2.setEnabled(false);
						t3.setEnabled(false);
						t4.setEnabled(false);
						t5.setEnabled(false);
						b6.setLabel("find");
					}
					catch(Exception e)
					{
						System.out.println("EXCEPTION");
					}
				}
			}
			
		}

		public static void main(String []z)
		{	
		Employee a=new Employee();
		}
}