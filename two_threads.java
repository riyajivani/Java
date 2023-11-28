//using thread class 


import java.util.*;

class demo1 extends Thread
{
     int n;  
     
     demo1(int c)
     {
          n=c;     
     }
     
     public void run()
     {
          for(int i=0; i<=n; i++)
          {
               if(i%2==0)
               System.out.println(i);
          }
     }
}

class demo2 extends Thread
{
   int n; 
     
     demo2(int c)
     {
          n=c;     
     }
     
     public void run()
     {
          for(int i=0; i<=n; i++)
          {
               if(i%2!=0)
               System.out.println(i);
          }
     }
}

public class two_threads
{
	public static void main(String[] args) {
		
		System.out.println("enter number.");
		Scanner in=new Scanner(System.in);
		int c=in.nextInt();
		
		demo1 d3=new demo1(c);
		demo2 d4=new demo2(c);
		
		d3.start();
        d4.start();
	}
}


//using runnable interface 

/*import java.util.*;

class demo1 implements Runnable
{
     int n;  
     
     demo1(int c)
     {
          n=c;     
     }
     
     public void run()
     {
          for(int i=0; i<=n; i++)
          {
               if(i%2==0)
               System.out.println(i);
          }
     }
}

class demo2 implements Runnable
{
   int n; 
     
     demo2(int c)
     {
          n=c;     
     }
     
     public void run()
     {
          for(int i=0; i<=n; i++)
          {
               if(i%2!=0)
               System.out.println(i);
          }
     }
}

public class Main
{
	public static void main(String[] args) {
		
		System.out.println("enter number.");
		Scanner in=new Scanner(System.in);
		int c=in.nextInt();
		
		demo1 d3=new demo1(c);
		demo2 d4=new demo2(c);
		
		//d3.start();
          		//d4.start();
          
         	 	Thread t1=new Thread(d3);
         		Thread t2=new Thread(d4);
          
          		t1.start();
          		t2.start();
	}
}*/
