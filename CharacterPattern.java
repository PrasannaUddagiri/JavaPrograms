import java.util.*;
class CharacterPattern
  {
    public static void main(String args[])
    {
       char ch='a';
      Scanner sc=new Scanner(System.in);
      System.out.println("enter n value");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print((ch++)+" ");
            }
          System.out.println("");
        }
    }
  }  
 
