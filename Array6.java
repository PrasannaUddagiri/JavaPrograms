import java.util.*;
class Array6
  {
    public static void main(String args[])
    {
      String a[]=new String[6];
      Scanner sc=new Scanner(System.in);
     System.out.println("enter array elements");
      for(int i=0;i<6;i++)
        {
          a[i]=sc.next();
        }
      System.out.println("the array elements are ");
      for(int i=0;i<6;i++)
        {
          System.out.print(a[i]+" ");
        }      
              }
  }