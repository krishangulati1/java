import java.io.*;
class Demo10
{
	public static void main(String []z)throws IOException
	{
		InputStreamReader a=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(a);
		int n[]=new int[5];
		int i;
		for(i=0;i<5;i++)
		{
			System.out.print("Enter the Element");
			n[i]=Integer.parseInt(b.readLine());
		}
		for(i=0;i<5;i++)
		{
			System.out.print(n[i]);
		}
	}
}