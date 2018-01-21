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
		h=w=d=2;
	}
	Box(double x,double y,double z)
	{
		h=x;
		w=y;
		d=z;
	}
	Box(double x)
	{
		h=w=d=x;
	}
	Box(Box x)
	{
		h=x.h;
		w=x.w;
		d=x.d;
	}
}
class Boxweight extends Box
{
	double we;
	void show()
	{
		super.show();
		System.out.println(we);
	}
	Boxweight()
	{
		super();
		we=1;
	}
	Boxweight(double x,double y,double z,double z1)
	{
		super(x,y,z);
		we=z1;
	}
	Boxweight(double x,double y)
	{
		super(x);
		we=y;
	}
	Boxweight(Boxweight x)
	{
		super(x);
		we=x.we;
	}
}
class Shipment extends Boxweight
{
	double cost;
	void show()
	{
		super.show();
		System.out.println(cost);
	}
	Shipment()
	{
		super();
		cost=4;
	}
	Shipment(double x,double y,double z,double z1,double z2)
	{
		super(x,y,z,z1);
		cost=z2;
	}
	Shipment(double x,double y,double z)
	{
		super(x,y);
		cost=z;
	}
	Shipment(Shipment x)
	{
		super(x);
		cost=x.cost;
	}
}
class Demo014
{
	public static void main(String []z)
	{
		Shipment a=new Shipment();
		a.show();
		System.out.println();
		Shipment b=new Shipment(10,30,33,3,1000);
		b.show();
		System.out.println();
		Shipment c=new Shipment(10,33.23,1000);
		c.show();
		System.out.println();
		Shipment d=new Shipment(b);
		d.show();
	}
}