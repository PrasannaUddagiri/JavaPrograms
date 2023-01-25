import java.util.*;
class DeleteElement
  {
    public static void main(String args[])
    {
      int a[]={34,56,78,12,23};
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the element position to delete : ");
      int pos=sc.nextInt();
     for(int i=0;i<a.length-1;i++)
        {
           if(pos==i)
          {
            a[i]=a[i+1];
          }
          else if(i>pos)
            a[i]=a[i+1];
          else
            a[i]=a[i];
        }
      System.out.println("enter the elements after deletion ");
     for(int i=0;i<a.length-1;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }