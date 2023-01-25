class Counter
  {
  int val = 0;
 
  void inc()
    {
    val++;
    }
 
  void dcr()
    {
    val--;
    }
}
 public class RaceCondition extends Thread
  {
  Counter c;
  RaceCondition(Counter c) 
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
    RaceCondition rc = new RaceCondition(c);
    for (int i = 0; i < 10000; i++)
    c.inc();
    rc.join();
    System.out.println("Final value of c.val: " + c.val);
  }
}
 





/*
Here, the main thread creates a Counter object c and a child thread with this object. The main
thread and the child thread then concurrently invoke inc() and dcr() methods on c 1000 times
respectively. At end, main thread prints the final value of c.val. When we executed this program
5 times
 
  what is the output?
 
  */


//program that illustrates need of Thread Synchronization
//execute this program more times to see the effect