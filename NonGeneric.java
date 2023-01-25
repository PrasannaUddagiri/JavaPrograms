//without wrapper class in array list
import java.util.*;
import java.util.ArrayList;
class NonGeneric
  {
    public static void main(String args[])
    {
      ArrayList al=new ArrayList();
      al.add("apple");
      al.add("mango");
      al.add(123);
      al.add('P');
      System.out.println(al);
    }
  }