import java.io.*;
class Demo11
{
	public static void main(String []z)throws IOException
	{
		InputStreamReader a=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(a);
		int x,y,k;
		x=Integer.parseInt(b.readLine());
		y=Integer.parseInt(b.readLine());
		System.out.print("values"+x +y);
		k=x;
		x=y;
		y=k;
		System.out.print("swaped values"+x +y);
	}
}