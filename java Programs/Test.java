/*throwing pre defined Exceptions Manually so far we use Exception handeling in which compiler throws and create an object of exception and its sub classes
	if we caught the execeptiuon in catch block then exception is considerd as ----- if not then jvm read this execption as a unhandeled exceptionand display 
	an error msg..........
	
	we thow pre defined exextion manually*/

class Exp13
{
	public static void Test()
	{
		
		int a,b,c;
		a=10;
		b=a-a;
		try
		{
			if(b==0)
			{
				throw new ArithmeticException("Divided by Zero");
			}	
			else
			{
			c=a/b;
			System.out.println(c);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			throw(e);
		}
	}
	
	public static void main(String []z)
	{
		try
		{
		Test();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught inside main  "+e);
		}
	}
}