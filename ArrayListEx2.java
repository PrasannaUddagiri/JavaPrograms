import java.util.*;
public class ArrayListEx2
  {
    public static void main(String args[])
    {
      ArrayList <Integer> al=new ArrayList <Integer>();
      al.add(34);
      al.add(31);
      al.add(87);
      al.add(45);
      al.add(46);
      System.out.println(al);
     System.out.println(al.set(0,87));
      System.out.println(al.get(3));
      System.out.println(al.size());
    }
  }