import java.util.*;
class LargestNumber
  {
    public static void main(String args[])
    {
      int num1,num2,num3;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number1 : ");
      num1=sc.nextInt();
      System.out.println("enter the number2 : ");
      num2=sc.nextInt();
      System.out.println("enter the number3 : ");
      num3=sc.nextInt();
      if((num1>num2)&&(num1>num3))
       {
          System.out.println(num1 + " is the largest number.");
       }
        else if((num2>num3)&&(num2>num1))
       {
         System.out.println(num2 + " is the largest number.");
       }
         else 
       {
         System.out.println(num3 + " is the largest number.");
       }
    }
  }
