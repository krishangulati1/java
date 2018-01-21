import java.io.*;
class Demo12
{
	public static void main(String []z)throws IOException
{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
	int x,y,k;
	System.out.println("Enter the element");
	x=Integer.parseInt(b.readLine());
	System.out.println("Enter the element");
	y=Integer.parseInt(b.readLine());
	System.out.println("Enter the element");
	k=Integer.parseInt(b.readLine());
	if(x>y)
	{
		if(x>k)
		{
			System.out.println(x+" is greatest");
		}
		else
		{System.out.println(k+" is greatest");}
	}
	else
	{
		if(y>k)
		{
			System.out.println(y+" is greatest");
		}
		else
		{
			System.out.println(k+" is greatest");
		}
	}
}
}