class One
{
	void show()
	{
		System.out.println("Show of one");
	}
}
class Two extends One
{
	void disp()
	{
		System.out.println("disp of Two");
	}
}
class Three extends One
{
	void show()
	{
		System.out.println("Show of Three");
	}
}
class Demo015
{
	public static void main(String []z)
	{
		One A=new One();
		A.show();
		Two b=new Two();
		b.show();
		b.disp();
		One c;
		c=b;
		c.show();
		
		//Two d;
		//d=(Two)c;
		Two d=(Two)c;
		d.disp();
		
		Three e=new Three();
		e.show();
		
		One f=new Three();
		f.show();
	}
}