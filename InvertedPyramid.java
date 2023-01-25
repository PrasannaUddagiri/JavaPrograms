import java.util.*;
class InvertedPyramid
  {
      public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("No. of rows :  ");
     int n=sc.nextInt();
      for(int i=0;i<=n;i++)
        {
          for(int j=0;j<=i;j++)
            {
              System.out.print(" ");
            }
          for(int k=n;k>=i;k--)
          {
          System.out.print("* ");
          }
          System.out.println();
        }
    }
  }

   