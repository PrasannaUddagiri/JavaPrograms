import java.util.*;
class ArrayList2
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList <String> al=new ArrayList <String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
    System.out.println(al);
  // ArrayList <String> al1=al.subList(0,2);
      System.out.println(al.subList(0,2));
    }
  }