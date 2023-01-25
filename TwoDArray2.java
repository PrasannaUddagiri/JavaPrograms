import java.util.*;
class TwoDArray2
  {
    public static void main(String args[])
    {
      int r,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter row size and column size");
      r=sc.nextInt();
      c=sc.nextInt();      
      int a[][]=new int[r][c];
      System.out.println("enter the values in to 2D array");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("the array element are");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              System.out.print("["+i+"]["+j+"]: "+a[i][j]+" ");
            }
          System.out.println();
        }
    }
  }