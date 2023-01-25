import java.util.*;
class MyThread extends Thread
  {
    int a[];
    MyThread(int arr[])
    {
      a=arr;
      start();
    }
    public void run()
    {
      Arrays.sort(a);
      System.out.println("sorting completed");
    }
  }
public class ThreadEx2
  {
    public static void main(String args[]) throws Exception
    {
      int b[]={1,6,4,9,3,2,7,0,5,8};
      MyThread t=new MyThread(b);
      t.join();
      System.out.println("main array elements are : ");
      for(int i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
     }
  }