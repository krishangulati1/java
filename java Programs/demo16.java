import java.io.*;
class demo16
{
public static void main(String []z)throws IOException
{
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
int x;
x=Integer.parseInt(b.readLine());
int n[][]=new int[3][x];
int r,c;
for(r=0;r<3;r++)
{
for(c=0;c<x;c++)
{
System.out.print("Enter the value");
n[r][c]=Integer.parseInt(b.readLine());
}
}
for(r=0;r<3;r++)
{
for(c=0;c<x;c++)
{
System.out.print(n[r][c]+"\t");
}
System.out.println();
}
}
}
