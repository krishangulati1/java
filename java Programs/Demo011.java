class Box
{
	double h,w,d;
	void setDim(double x ,double y ,double z )
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
	void setWeight(double z1)
	{
		we=z1;
	}
	void disp()
	{
		System.out.println(we);
	}
}
class ShipMent extends BoxWeight
{
	double cost;
	void setcost(double z2)
	{
		cost=z2;
	}
	void display()
	{
		System.out.println(cost);
	}
}
class Demo011
{
	public static void main(String []z)
	{
		ShipMent a=new ShipMent();
		a.setDim(10,20,30);
		a.setWeight(66.7);
		a.setcost(100);
		a.show();
		a.disp();
		a.display();
	}
}
