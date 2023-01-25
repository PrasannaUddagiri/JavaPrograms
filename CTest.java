//java program to find whether given character is an alphabet,vowel,consonant.
import java.util.*;
class Ctest
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value : ");
      ch=sc.next().charAt(0);
      if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
      {
        System.out.println("it is an alphabet");
      }
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
        System.out.println("it is an vowel");
      }
      else
      {
        System.out.println("it is a consonant");
      }
      }
  }