//throwing user Defined Exception
class invalidmarksException extends Exception
{
	invalidmarksException(String msg)
	{
		super(msg);
	}
}
class kk
{
	public static void grade(int t)throws invalidmarksException	
	{
		
		if(t<0||t>100)
		{
			throw new invalidmarksException("mrks should b in range of 0-100");
		}
		else
		{
		
				if(t>80){
					System.out.println("a grade");
					
				}
				else if(t>70)
				{
					System.out.println("b grade");
				}
				else {
					System.out.println("c grade");
				}
		}
	}
	public static void main(String []z)
	{
		try
		{
			grade(Integer.parseInt(z[0]));
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}