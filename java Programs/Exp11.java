class Exp11
{
	public static void main(String []z)
	{
		int a=z.length;
		System.out.println(a);
		try
		{
			int b=100/a;
			System.out.println(b);
				
				try
				{				
					if(a==1)
					{
						int c[]={99};
						System.out.println(c[1]);
					
					}
					if(a==2)
					{
						int d[]={100};
						System.out.println(d[0]/(d[0]-d[0]));
					}
				}
					catch(ArrayIndexOutOfBoundsException e)
						{
							System.out.println(e);
						}
					System.out.println("After inner try");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("after outer try");
	}
}