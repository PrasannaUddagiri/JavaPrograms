import java.util.*;
class CTest2
  {
    public static void main(String args[])
    {
      int num,digit=0,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number : ");
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
          //145= 1+4*3*2+5*4*3*2=1+24+120=145
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