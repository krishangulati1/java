class Box
{
	double h,w,d;
	void show()
	{
		System.out.println(h);
		System.out.println(w);
		System.out.println(d);
	}
	Box(double x,double y,double z)
	{
		h=x;
		w=y;
		d=z;
	}
}
class Demo1
{
	public static void main(String []z)
	{
		Box a=new Box(10,20,30);
		a.show();
	}
}