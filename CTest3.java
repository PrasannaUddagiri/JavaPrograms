import java.util.*;
class CTest3
  {
    public static void main(String args[])
    {
      int n,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size : ");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the elements :");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<a.length;i++)
        {
      for(int j=i+1;j<a.length;j++)
        {
          if(a[i]>a[j])
          {
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
             }
        }
        }
        
      for(int i=0;i<a.length;i++)
    System.out.print(a[i]+ " ");
        
    
    }
  }