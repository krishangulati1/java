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
class Demo010
{
	public static void main(String []z)
	{
		BoxWeight a=new BoxWeight();
		a.setDim(10,20,30);
		a.setWeight(66.7);
		a.show();
		a.disp();
	}
}
