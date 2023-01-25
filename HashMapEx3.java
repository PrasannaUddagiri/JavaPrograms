[12:45 AM, 1/18/2023] Anitha Bitlabs: import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");  
      hm.put(3,"banana");
      hm.put(4,"grapes");
      hm.put(5,"banana"); 
      System.out.println(hm);
      hm.putIfAbsent(7,"cherries");
      System.out.println("iterating the elements");
     for(Map.Entry m:hm.entrySet())
       {
         System.out.println(m.getKey()+" "+m.getValue());
       }
      if(hm.containsValue("apple"))
      {
        System.out.println("value is found");
      }
      else
      {
        System.out.println("value is not found");
      }
      if(hm.containsKey(7))
      {
        System.out.println("key is found");
         }
      else
      {
        System.out.println("key is not found");
      }
    }
