import java.util.*;
class Count
  {
    public static void main(String args[])
    {
      int num,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      num=sc.nextInt();
     while(num>0)
       {
          count++;
          num=num/10;
       }
      System.out.println("the count of the number is "+count);
    }
  }