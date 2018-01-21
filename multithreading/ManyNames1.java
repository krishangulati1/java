//same as program ManyNames
class NameRunnable implements Runnable 
{
	public void run() 
	{
	for (int x = 1; x < 4; x++) 
	{
		System.out.println("Run by "+ Thread.currentThread().getName());
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{ 
			System.out.println("Exception"+e);
		}
	}
	}
}
public class ManyNames1
{
	public static void main (String [] args) 
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
		two.start();
		three.start();
		
		one.setPriority(Thread.MIN_PRIORITY);
		two.setPriority(Thread.NORM_PRIORITY);
		three.setPriority(Thread.MAX_PRIORITY);
		
		try
		{
			one.join();
			two.join();
			three.join();
		}
		catch(Exception e)
		{
			System.out.println("Exception "+e);
		}
	}
}