class Box
{
	double h,w,d;
	void set(double x ,double y ,double z )
	{
	h=x;
	w=y;
	d=z;
	}
	void show()
	{
	System.out.println(h);
	System.out.println(w);
	System.out.println(d);
	}
}
class BoxWeight extends Box
{
	double we;
	void set(double z1)
	{
		we=z1;
	}
	void show()
	{
		super.show();
		System.out.println(we);
	}
}
class ShipMent extends BoxWeight
{
	double cost;
	void set(double z2)
	{
		super.set(z2);
		cost=1000;
	}
	void show()
	{
		super.show();
		System.out.println(cost);
	}
}
class Demo012
{
	public static void main(String []z)
	{
		ShipMent a=new ShipMent();
		a.set(10,20,30);
		a.set(33.79);
		a.show();
	}
}
