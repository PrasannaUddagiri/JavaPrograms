//Example for private Acess Modifier
class Library
  {
    String bname;
    int bid;
     void display()
      {
      System.out.println("book name is"+bname+" "+"book id"+bid);
      }
 }
class PrivateEx
  {
    public static void main(String args[])
    {
      Library lb=new Library();
      lb.bname="ABC";
      lb.bid=101;
      lb.display();
    }
  }