import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");
      hm.put(3,"banana");
      hm.put(4,"grapes");
      System.out.println(hm);
      System.out.println("iterating the elements");
     for(Map.Entry m:hm.entrySet())
       {
         System.out.println(m.getKey()+" "+m.getValue());
       }
    }
  }