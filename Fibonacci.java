import java.util.*;
class Fibonancci
  {
    public static void main(String args[])
    {
      int n1=0,n2=1,n3,num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the numbers you want to print");
      num=sc.nextInt();
      System.out.print(n1+" "+n2);
      for(int i=2;i<num;i++)
        {
          n3=n1+n2;
          System.out.print(" "+n3);
          n1=n2;
          n2=n3;
        }
    }
  }