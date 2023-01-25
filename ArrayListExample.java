import java.util.*;
class ArrayListExample
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
    //Iterating the element using for loop
      System.out.println("Iterating elements through for loop");
      for(int i=0;i<al.size();i++)
        {
          System.out.println(al.get(i));
        }
      //Using for each
      //for(datatype variablename:arrayname)
      System.out.println("Iterating elements through for each loop");
      for(String str:al)
        {
          System.out.println(str);
        }
      }
  }