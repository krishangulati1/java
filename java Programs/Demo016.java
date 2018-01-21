class Triangle
{
	double s1,s2,s3;
	double pucost=1000;
	Triangle(double x,double y,double z)
	{
		s1=x;
		s2=y;
		s3=z;
	}
	double area()
	{
		double m;
		m=(s1+s2+s3)/2;
		return(Math.sqrt(m*(m-s1)*(m-s2)*(m-s3)));
	}
	double calcost()
	{
		return(pucost*area());
	}
}
class Reactangle
{
	double s1,s2;
	double pucost=1000;
	Reactangle(double x,double y)
	{
		s1=x;
		s2=y;
	}
	double area()
	{
		return(s1*s2);
	}
	double calcost()
	{
		return(pucost*area());
	}
}
class Demo016
{
	public static void main(String []z)
	{
		Triangle a=new Triangle(3,4,6);
		System.out.println(a.area());
		System.out.println(a.calcost());
		
		Reactangle b=new Reactangle(3,6);
		System.out.println(b.area());
		System.out.println(b.calcost());
		
	}
}