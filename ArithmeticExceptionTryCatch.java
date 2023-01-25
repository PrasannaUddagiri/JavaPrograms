class ArithmeticExceptionTryCatch
  {
    public static void main(String args[])
    {
    int a=45,b=0;
    try
    {
      int c=a/b;
      System.out.println("division is : "+c);
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }
      System.out.println("exception handled");
      System.out.println("welcome to bitlabs");
  }
  }