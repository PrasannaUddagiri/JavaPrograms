import java.util.*;
class Boolean1
  {
    public static void main(String args[])
    {
      boolean b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 'b' value : ");
      b=sc.nextBoolean();
      System.out.println("the value is : "+(!b));
    }
  }