import java.util.*;
class OddNumber
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number : ");
      num=sc.nextInt();
      if(num%2!=0)
      {
        System.out.println("the num is an odd number");
      }
      else
        System.out.println("the num is not an odd number");
    }
  }