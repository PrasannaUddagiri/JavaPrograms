import java.util.*;
class Prime2
{
    public static void main(String arg[])   
    {
    int i,j;
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
    int num1=sc.nextInt();
       System.out.println("enter the second number");
    int num2=sc.nextInt();
  System.out.println("Prime numbers between "+num1+" to "+num2+" are ");
    for(i=num1;i<=num2;i++)
      {
        if(i==1||i==0)
          continue;
        int count=1;
        for(j=2;j<=i;j++)
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