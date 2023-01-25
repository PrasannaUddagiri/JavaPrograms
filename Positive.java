import java.util.*;
class Positive
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number : ");
      num=sc.nextInt();
      if(num>0)
      {
        System.out.println("the num is positive number");
      }
      else
        System.out.println("the num is not a positive number");
    }
  }