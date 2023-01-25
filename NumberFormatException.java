//Number Format Exception
class NumberFormatException
  {
    public static void main(String args[])
    {
      String s="123@a";
      int x=Integer.parseInt(s);
      System.out.println("x value is : "+x);
     }
  }