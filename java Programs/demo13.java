import java.io.*;
class Demo13
{
public static void main(String []z)throws IOException
{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
int x,y,k,q;
System.out.println("MENU");
System.out.println("1.sum");
System.out.println("2.sub");
System.out.println("3.multi");
System.out.print("ENTER YOUR CHOICE:-");
k=Integer.parseInt(b.readLine());
System.out.print("ENTER THE VALUE");
x=Integer.parseInt(b.readLine());
System.out.print("ENTER SECOND VALUE");
y=Integer.parseInt(b.readLine());
switch(k)
{
case 1:
	q=x+y;
System.out.print("The sum is"+q);
	break;
case 2:
	q=x-y;
System.out.print("the sub is"+q);
	break;
case 3:
	q=x*y;
System.out.print("the multi is"+q);
	break;
default:
System.out.print("Invalid option");
}
}
}