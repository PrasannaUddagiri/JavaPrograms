import java.util.*;
class Alphabet
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter value");
      ch=sc.next().charAt(0);
      if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
      {
        System.out.println("it is alphabet");
      }
      else
      {
        System.out.println("it is not alphabet");
      }
    }
  }