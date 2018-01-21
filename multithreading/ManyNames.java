class NameRunnable implements Runnable 
{
	public void run()
	{
		for (int x = 1; x <= 3; x++)
		{
		System.out.println("Run by "+Thread.currentThread().getName()+ ",x = " + x);
		}
	}
}
public class ManyNames 
{
	public static void main(String [] args)
	{
		// Make one Runnable
		NameRunnable nr = new NameRunnable();
		
		Thread one = new Thread(nr);
		one.setName("Fred");
		
		Thread two = new Thread(nr);
		two.setName("Lucy");
		
		Thread three = new Thread(nr);
		three.setName("Ricky");
		
		one.start();
		try
		{
			one.sleep(600);
		}
		catch(InterruptedException e)
		{
			System.out.println("Execption"+e);
		}
		two.start();
		try
		{
			two.sleep(200);
		}
		catch(InterruptedException e)
		{
			System.out.println("Execption"+e);
		}
		three.start();
		try
		{
			three.sleep(300);
		}
		catch(InterruptedException e)
		{
			System.out.println("Execption"+e);
		}
		/* System.out.println(one);
		System.out.println(two);
		System.out.println(three); */
		}
}