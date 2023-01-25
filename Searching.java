import java.util.*;
class Searching
  {
    public static void main(String args[])
    {
      int n,p,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size : ");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the elements : ");
       for(int i=0;i<a.length;i++)
         {
          a[i]=sc.nextInt(); 
         }
      System.out.println("enter the element to find : ");
     p=sc.nextInt();
      int i,pos=0;
      for(i=0;i<a.length;i++)
        {
          if(a[i]==p)
          {
            count++;
            pos=i;
          }
          if(count>0)
          {
            System.out.println("element found at : "+pos);
          }
          else
          {
            System.out.println("element not found");
          }
        }
    }
  }