import java.io.*;
class Demo15
{
public static void main(String []z)throws IOException
{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
int n[]=new int[5];
int i;
for(i=0;i<=4;i++)
{
System.out.println("Emter the element");
n[i]=Integer.parseInt(b.readLine());
}
for(i=0;i<=4;i++)
{
System.out.print(n[i]+"\t");
}
}
}