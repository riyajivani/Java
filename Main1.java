/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main1 extends Thread
{
     public void run()
     {
          System.out.println("Thread task");
          System.out.println("In rum method :" +Thread.currentThread().getName());//Tharead 0
          
     }
	public static void main(String[] args)
	{
		System.out.println("Hello");
	     Main1 t = new Main1();
	     t.start();
		
		/*System.out.println("Current Thread Name :" +Thread.currentThread().getName());//main
		Thread.currentThread().setName("Maitri");
		System.out.println("Now Thread Name :" +Thread.currentThread().getName());//Maitri
	    //System.out.println(10/0);//Exception in Maitri class*/
	}
}
