import java.util.*;
public class ArrayListEx1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array : ");
      int a=sc.nextInt();
      System.out.println("enter the elements : ");
      ArrayList <Integer> al=new ArrayList <Integer>();
      for(int i=0;i<a;i++)
        {
          al.add(sc.nextInt());
        }
          System.out.println(al);
     }
  }



/*import java.util.*;
class ArrayListEx
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the list");
      int num=sc.nextInt();
     ArrayList<Integer> al=new ArrayList<Integer>(); 
      for(int i=0;i<num;i++)
        {
          System.out.println("add element at "+i+" : ");
          al.add(sc.nextInt());
        }
     System.out.println(al);
      }
  }*/











