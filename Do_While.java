import java.util.*;
class Do_While
  {
    public static void main(String args[])
    {
      char ch='A';
     // Scanner sc=new Scanner(System.in);
      //System.out.println("enter the character");
      //ch=sc.next().charAt(0);
      do
        {
          System.out.print(ch+" ");
          ch++;
     } 
        while(ch<='Z');
  }
  }