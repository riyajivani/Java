/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

class insert implements Runnable
{
     public int[] arr = new int[5];
     
     synchronized public void run()
     {
		t4.wait();
          System.out.println("insert");
          
          for(int i=0; i<5; i++)
          {
               Scanner in=new Scanner(System.in);
               int c=in.nextInt();
               arr[i]=c;
          }
     }
}

class Delete extends insert implements Runnable
{
     synchronized public void run()
     {
          System.out.println("delete");
          
          for(int i=0; i<3; i++)
          {
               arr[i]=0;
          } 
     }
}

class display extends insert implements Runnable
{
     synchronized public void run()
     {
          for(int i=0; i<5; i++)
          {
               System.out.println(arr[i]+" ");
          } 
          
          System.out.print("\n");
     }  
}

public class queue_thread
{
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		insert i1 = new insert();
		//Thread t1=new Thread(i1);
		//t1.start();
		
		display di2 = new display();
		//Thread t4=new Thread(di2);
		//t4.start();
		
		Delete d1 = new Delete();
		//Thread t2=new Thread(d1);
		//t2.start();
		
		display di1 = new display();
		//Thread t3=new Thread(di1);
		//t3.start();
		
		Thread t1=new Thread(i1);
		Thread t2=new Thread(di2);
		Thread t3=new Thread(d1);
		Thread t4=new Thread(di1);
		
		while(t1.start())
		{
			t2.wait(); t3.wait(); t4.wait();	
		}
		//t2.notify();
		
		//t2.start();
		//t3.start();
		//t4.start();
	}
}
