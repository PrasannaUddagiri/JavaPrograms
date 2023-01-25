import java.util.*;
class HashMapEx1
  {
    public static void main(String args[])
    {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(1,"mango");
      hm.put(2,"apple");  
      hm.put(3,"banana");
      hm.put(4,"grapes");
      hm.put(5,"banana"); //It accepts duplicate values
      hm.put(2,"berries");  //It doesnot accepts duplicate keys
      hm.put(6,null); //accepts null values"
      hm.put(null,"tomato"); //It accpets only one null key
      hm.put(null,"potato");
      System.out.println(hm);
      System.out.println("iterating the elements");
     for(Map.Entry m:hm.entrySet())
       {
         System.out.println(m.getKey()+" "+m.getValue());
       }
    }