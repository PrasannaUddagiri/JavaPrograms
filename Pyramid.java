import java.util.*;
class Pyramid
  {
    public static void main(String args[])
    {
      int v;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the value for ROWS : ");
      v=sc.nextInt();
      System.out.println(" ");
      for(int i=1;i<=v;i++)
        {
          for(int j=(v-i);j>=0;j--)
            {
               System.out.print(" ");
            }
          for(int j=1;j<=i;j++)
            {
              System.out.print("* " );
            }
          System.out.println(" ");
        }
     
    }
  }