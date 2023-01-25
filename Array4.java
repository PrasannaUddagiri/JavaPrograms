import java.util.*;
class Array4
  {
    public static void main(String args[])
    {
      int a[]=new int[6];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array elements");
      a[0]=sc.nextInt();
      a[1]=sc.nextInt();
      a[2]=sc.nextInt();
      a[3]=sc.nextInt();
      a[4]=sc.nextInt();
      a[5]=sc.nextInt();
      System.out.println("the array elements are ");
      for(int i=0;i<6;i++)
        {
          System.out.print(a[i]+" ");
        }      
              }
  }