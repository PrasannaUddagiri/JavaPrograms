 import java.util.*;
class Percentage1
  {
    public static void main(String args[])
    {
      int percentage;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter percentage : ");
      percentage=sc.nextInt();
      if(percentage>85 && percentage<=100)
      {
        System.out.println("u got A+ grade");
      }
      else if(percentage>70 && percentage<=85)
      {
        System.out.println("u got A grade");
      }
      else if(percentage>60 && percentage<=70)
      {
        System.out.println("u got B grade");
      }
      else if(percentage>45 && percentage<=60)
      {
       System.out.println("u got C grade"); 
      }
      else
      {
        System.out.println("u failed");
      }
    }
  }