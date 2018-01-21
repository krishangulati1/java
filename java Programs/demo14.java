import java.io.*;
class Demo14
{
public static void main(String []z)throws IOException
{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferReader(a);
int x,y;
System.out.println("ENTER VALUE:- ");
x=Integer.parseInt(b.readLine());
System.out.println("ENTER VALUE:- ");
y=Integer.parseInt(b.readLine());
(x>y)?System.out.println(x+"is greatest"):System.out.println(y+"is greatest");
}
}
