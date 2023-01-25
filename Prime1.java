import java.util.*;
class Prime1
{
    public static void main(String arg[])   
    {
    int i,j;
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the limit of the numbers");
    int num=sc.nextInt();
  System.out.println("Prime numbers between 1 to "+num+" are ");
    for(i=2;i<=num;i++)
      {
        int count=0;
        for(j=1;j<=i;j++)
          {
            if(i%j==0)
            {
              count++;
            }
          }
        if(count==2)
        {
          System.out.print(i+" ");
        }
      }
    }
}