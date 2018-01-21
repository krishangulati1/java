class One
{
	int a,b;
	One(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+"\t"+b);
	}
}
class Two extends One
{
	int c,d;
	Two(int x,int y,int z,int z1)
	{
		super(x,y);
		c=z;
		d=z1;
		System.out.println(c+"\t"+d);
	}
	
}
class Demo013
{
	public static void main(String []z)
	{
		Two a=new Two(20,30,10,50);
	}
}