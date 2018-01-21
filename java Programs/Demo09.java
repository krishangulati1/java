class Box
{
double h,w,d;
	void show()
	{
		System.out.println(h);
		System.out.println(w);
		System.out.println(d);
	}
	Box()
	{
	h=w=d=1;
	}
	Box(double x,double y,double z)
	{
		h=x;
		w=y;
		d=z;
	}
	Box(double x)
	{
		h=w=d=2;
	}
	Box(Box x)
	{
		h=x.h;
		w=x.w;
		d=x.d;
	}
	
}
class Demo09
{
	public static void main(String []z)
	{
		Box a=new Box();
		a.show();
		System.out.println();
		Box b=new Box(10,20,30);
		b.show();
		System.out.println();
		Box c=new Box(10);
		c.show();
		System.out.println();
		Box d=new Box(b);
		d.show();
	}
}