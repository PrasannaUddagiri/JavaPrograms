class Counter
  {
  int val = 0;
 synchronized void inc() 
    {       
    val++;
    }
  synchronized void dcr()
    {       
    val--;
    }
}
 public class RaceCondition1 extends Thread
   {
  Counter c;
  RaceCondition1(Counter c)
   {
    this.c = c;
    start();
    }
 public void run()
     {
    for (int i = 0; i < 10000; i++)
      c.dcr();
     }
 public static void main(String args[]) throws Exception
     {
    Counter c = new Counter();
    RaceCondition1 rc = new RaceCondition1(c);
    for (int i = 0; i < 10000; i++)
    c.inc();
    rc.join();
    System.out.println("Final value of c.val: " + c.val);
  }
}
 








/*
When main thread executes, inc() on c, 
it owns c’s lock. Before finishing this method, the child thread cannot own the lock of c; therefore 
cannot execute dcr(). Similarly, when child thread executes dcr(), it owns the lock of c. During that 
time main thread waits. So, these methods are executed without any form of interleaving. However, 
we have no control whatsoever on the order these methods are executed. 
  */



//program that illustrates Thread Synchronization
//program that illustrates synchronized method