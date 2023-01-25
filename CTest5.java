//WAP of java to remove the duplicate elements in an array
//WAP of java to find the sum of second largest number and second smallest number in an array

import java.util.*;
import java.util.ArrayList;
class CTest5
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array : ");
      int n=sc.nextInt();
      LinkedHashSet<Integer> lk=new LinkedHashSet<Integer>();
      System.out.println("enter the elements of an array : ");
      for(int i=0;i<n;i++)
        {
          lk.add(sc.nextInt());
        }
      ArrayList<Integer> al=new ArrayList<Integer>(lk);
      System.out.println("elements after removing duplicates from given array : "+al);
    }
  }



/*import java.util.*;
class CTest5
{
 public static void main(String args[]) 
    {
       int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of an array : ");
        for (int i=0;i<n;i++) 
        {
            a[i]=sc.nextInt();
        }
       int sum=0;
       for(int i=0;i<n;i++)
         {
           sum=sum+a[i];
         }
      System.out.println("sum of elements : "+sum);
      
        for (int i=0;i<n;i++) 
        {
            for (int j=i+1;j<n;j++) 
            {
                if (a[i]>a[j]) 
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second Largest:"+(a[n-2]));
        System.out.println("Second Smallest:"+a[1]);
    }
}*/
           


      
           



