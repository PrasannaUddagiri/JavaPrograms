import java.util.*;
public class ArrayListEx
  {
    public static void main(String args[])
    {
      ArrayList <Integer> al=new ArrayList <Integer>();
      al.add(12);
      al.add(45);
      al.add(98);
      al.add(34);
      al.add(78);
      System.out.println(al);
      al.add(3,56);
     System.out.println(al);
      al.remove(4);
      System.out.println(al);
    }
  }