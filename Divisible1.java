import java.util.*;
class Divisible1
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number : ");
      num=sc.nextInt();
      if((num%5==0)&&(num%11==0))
      {
        System.out.println("the num is divisible");
      }
      else
        System.out.println("the num is not divisible");
    }
  }