/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main implements Runnable
{
     public void run()
     {
          System.out.println("My first Thread program.");
		  System.out.println("Current Running Thraed:" +Thread.currentThread().getName());
     }
	public static void main(String[] args)
	{
	     Main d1 = new Main();
	     Thread t1 = new Thread(d1);
		Main d2 = new Main();
		Thread t2 = new Thread(d2);
		Main d3 = new Main();
		Thread t3 = new Thread(d3);
		
		System.out.println("Default priority of Thraed 1:" + t1.getPriority());
		System.out.println("Default priority of Thraed 2:" + t2.getPriority());
		System.out.println("Default priority of Thraed 3:" + t3.getPriority());
		
		t1.setPriority(6);
		t2.setPriority(3);
		t3.setPriority(9);

		
	    t1.start();
		//System.out.println("Current Running Thraed:" +Thread.currentThread().getName());
		t2.start();
		//System.out.println("Current Running Thraed:" +Thread.currentThread().getName());
		t3.start();
		//System.out.println("Current Running Thraed:" +Thread.currentThread().getName());
		
		/*System.out.println("Current Running Thraed:" +Thread.currentThread().getName());
		System.out.println("Current Running Thraed:" +Thread.currentThread().getName());
		System.out.println("Current Running Thraed:" +Thread.currentThread().getName());*/
		
	    System.out.println("Changed Priority of Thread 1:" +t1.getPriority());
	    System.out.println("Changed Priority of Thread 2:" +t2.getPriority());
	    System.out.println("Changed Priority of Thread 3:" +t3.getPriority());
	}
}
