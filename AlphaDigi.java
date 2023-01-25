 //WAP to input any character and check whether it is alphabet, digit or special character
import java.util.*;
class AlphaDigi
  {
    public static void main(String args[])
    {
      char ch;
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value : ");
      num=sc.nextInt();
      ch=sc.next().charAt(0);
      if(num>='0'&&num<='9')
      {
        System.out.println("it is a digit");
      }
      else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
      {
        System.out.println("it is an alphabet");
      }
    }
  
  }