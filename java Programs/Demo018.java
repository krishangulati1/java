class Shape
{
	double pucost=1000;
	double area()
	{
		System.out.println("area is not Defined");
		return(0.0);
	}
	double calcost()
	{
		return(pucost*area());
	}
}
class Triangle extends Shape
{
		double s1,s2,s3;
		Triangle(double x,double y,double z)
		{
			s1=x;
			s2=y;
			s3=z;
		}
		/*double area()
		{
			double s;
			s=(s1+s2+s3)/2;
			return(Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)));
		}*/
}
		class Rectangle extends Shape
		{
			double s1,s2;
			Rectangle(double x,double z)
			{
				s1=x;
				s2=z;
			}
			double area()
			{
				return(s1*s2);
			}
		}
		class Square extends Shape
		{
			double s;
			Square(double x)
			{
				s=x;
			}
			double area()
			{
				return(s*s);
			}
		}
class Demo018
{
	public static void main(String []z)
	{
		Triangle a=new Triangle(3,7,8);
		System.out.println(a.area());
		System.out.println(a.calcost());
		
		Reactangle b=new Reactangle(6,6);
		System.out.println(b.area());
		System.out.println(b.calcost());
		
		Square c=new Square(4);
		System.out.println(c.area());
		System.out.println(c.calcost());
	}
}