import java.util.*;
class ArrayListSample
  {
    public static void main(String args[])
    {
      ArrayList al=new ArrayList();
      al.add("Mango");
      al.add(12);
      al.add(42.8f);
      al.add('M');
      al.add(786.24);
      System.out.println(al);
      System.out.println(al.size());
      System.out.println(al.get(4));
      System.out.println(al.set(1,14));
      System.out.println(al);
    }
  }