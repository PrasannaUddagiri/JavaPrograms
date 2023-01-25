class NumberExceptionTryCatch
  {
    public static void main(String args[])
    {
      String s="prasanna@123";
      try
        {
        int x=Integer.parseInt(s);
          System.out.println(x);
      }
      catch(Exception e)
        {
          System.out.println(e);
        }
      System.out.println("exception handled");
    }
  }