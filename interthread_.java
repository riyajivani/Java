class interthread
{
     public static void main (String[] args) {
     
          threadB b=new threadB();
          b.start();
          
          synchronized(b)
          {
               System.out.println("main method thread call.");
               try{b.wait();}catch(Exception e){}
               
               System.out.println("main method notified");
               System.out.println("total balance = " + b.total_balance);
          }
     }     
}

class threadB extends Thread
{
     int total_balance;
     
     threadB()
     {
          total_balance=0;
     }
     
     public void run()
     {
          synchronized(this)
          {
               System.out.println("child thread executed");
               
               for(int i=0; i<=5; i++)
               {
                    total_balance=total_balance+i;
               }
               
               System.out.println("child thread notified");
               
               this.notify();
          }
     }
}