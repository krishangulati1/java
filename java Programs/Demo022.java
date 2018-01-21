interface Shape
{
	double pucost=1000;
	double area();
	double calcost();
	
}
abstract class AbsShape implements Shape
{
	public double calcost()
	{
		return(pucost*area());
	}
}
class Triangle extends AbsShape
{
		double s1,s2,s3;
		
		Triangle(double x,double y,double z)
		{
			s1=x;
			s2=y;
			s3=z;
		}
		public double area()
		{
			double s;
			s=(s1+s2+s3)/2;
			return(Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)));
		}
}
		class Rectangle extends AbsShape
		{
			double s1,s2;
			Rectangle(double x,double z)
			{
				s1=x;
				s2=z;
			}
			public double area()
			{
				return(s1*s2);
			}
		}
		class Square extends AbsShape
		{
			double s;
			Square(double x)
			{
				s=x;
			}
			public double area()
			{
				return(s*s);
			}
		}
class Demo022
{
	public static void main(String []z)
	{
		AbsShape a=new Triangle(3,7,8);
		System.out.println(a.area());
		System.out.println(a.calcost());
		
		a=new Rectangle(6,6);
		System.out.println(a.area());
		System.out.println(a.calcost());
		
		a=new Square(4);
		System.out.println(a.area());
		System.out.println(a.calcost());
		
		/* Shape d=new Shape();
		System.out.println(d.area());
		System.out.println(d.calcost());*/
		
		Shape e=new Triangle(3,4,5);
		System.out.println(e.area());
		System.out.println(e.calcost());
	}
}