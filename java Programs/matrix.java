import java.io.*;
class Matrix
{
public static void main(String []z)throws IOException
{
int x;
boolean k=true;
while(k)
{
System.out.print("1.Array Input\n2.Display\n3.Transpose\n4.Row Sum\n5.Column Sum\n6.Row Sort\n7.Column Sort\n8.Full Sort\n9.new 2nd Array(B)\n10.sum(a+b)\n11.multi\n12.exit");
InputStreamReader a=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(a);
x=Integer.parseInt(b.readLine());
switch(x)
{
case 1:
int n[][]=new int [3][3];
int i,i;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
n[i][j]=Integer.parseInt(b.readLine());
}
}
break;

case 2:
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(n[i][j]);
}
System.out.println();
}
break;

case 3:

break;

case 4:
int j,i,s;
for(i=0;i<3;i++)
{
for(j=0,s=0;j<3;j++)
{
s=s+n[i][j];
}
System.out.print("="+s);
System.out.println();
}
break;

case 5:
int r,c;
for(c=0;c<3;c++)
{
for(r=0,s=0;r<3;r++)
{
s=s+n[r][c];
}
System.out.print("||"+s);
System.out.println();
}
break;

case 6:
int r,c;
for(r=0;r<3;r++)
{
for(c=0;c<2;c++)
{
if(n[r][c]>n[r][c])
{
int k;
q=n[r][c];
n[r][c]=n[r][c+1];
n[r][c+1]=q;
}
}
}
break;

case 7:
int r,c;
for(c=0;c<3;c++)
{
for(r=0;r<2;r++)
{
if(n[r][c]>n[r][c])
{
int q;
q=n[r][c];
n[r][c]=n[r][c+1];
n[r][c+1]=q;
}
}
}
break;

case 12:
k=false;
}
}
}
}




