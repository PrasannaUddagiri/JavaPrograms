import java.util.*;
class Reverse1
  {
    public static void main(String args[])
    {
      int n,first=0,last=0,result=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the numbers ");
      n=sc.nextInt();
      last=n%10;
      while(n!=0)
      {
        result=n/10;
        first=n;
        System.out.println(n);
         n=n/10;
      }
      System.out.println("the first number is "+first);
      System.out.println("the last number is "+last);

    }
   }
 
  