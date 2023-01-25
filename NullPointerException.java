//Null Pointer exception
class NullPointerException
  {
    public static void main(String args[])
    {
      String s=null;
      System.out.println(s.length());
      System.out.println(s.concat("hello"));
    }
  }