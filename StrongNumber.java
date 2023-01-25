import java.util.*;
class StrongNumber
  {
    public static void main(String args[])
    {
      int num,sum=0,digit=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      num=sc.nextInt();
      int temp=num;
      while(num>0)
        {
          digit=num%10;
          int fact=1;
           
          
          for(int i=1;i<=digit;i++)
            {
             fact=fact*i;
            }
             sum=sum+fact;
             num=num/10;
         } 
          if(temp==sum)
           {   
             System.out.println("the number is strong number");
           }
            else
           {
             System.out.println("the number is not strong number");
           }
      }
  }