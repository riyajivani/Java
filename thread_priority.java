public class thread_priority extends Thread
{
     public void run()
     {
          System.out.println(Thread.currentThread().getName());
          System.out.println("in run method");
     }
     
     public static void main (String[] args) {
          
          thread_priority t1=new thread_priority();
          thread_priority t2=new thread_priority();
          thread_priority t3=new thread_priority();
          
          System.out.println(t1.getPriority());
          System.out.println(t2.getPriority());
          System.out.println(t3.getPriority());
          
          t1.setPriority(6);
          t2.setPriority(3);
          t3.setPriority(9);
          
          t1.start();
          t2.start();
          t3.start();
          
          System.out.println("new: "+t1.getPriority());
          System.out.println("new: "+t2.getPriority());
          System.out.println("new: "+t3.getPriority());
     }
}