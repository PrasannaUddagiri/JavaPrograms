import java.util.*;
class ArrayListExample1
  {
    public static void main(String args[])
    {
  //  List al=new ArrayList();
      ArrayList<String> al=new ArrayList<String>();
      al.add("apple");
      al.add("orange");
      al.add("grapes");
      al.add("blueberries");
      al.add("tomato");
      System.out.println(al);
    //Iterating the element using iterator interface
      Iterator<String> itr=al.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      
      
      }
  }