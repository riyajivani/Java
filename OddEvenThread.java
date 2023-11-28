class OddEvenThread
{	
	public static void main(String [] args)
	{	
		Odd a = new Odd();
		a.start();
		
		synchronized(a)
		{
			try{a.wait();}catch(Exception e){}
			System.out.println("even numbers");
			
			for(int i=0;i<10;i++)
			{
				if(i%2==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}

class Odd extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			System.out.println("odd numbers");
			
			for(int i=0;i<10;i++)
			{
				if(i%2!=0)
				{
					System.out.println(i);
				}
			}
			
			this.notify();
		}
	}
}