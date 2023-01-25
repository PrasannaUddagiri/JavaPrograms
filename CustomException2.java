mport java.util.*;
class InvalidMobileNumberException extends Exception
  {
    InvalidMobileNumberException(String str)
    {
      super(str);
    }
  }
class CustomException2
  {
    public static void validate(String no) throws InvalidMobileNumberException
    {
      if(no.length()!=10)
      {
        throw new InvalidMobileNumberException("your mobile number is invalid");
      }
      else
      {
        System.out.println("it is valid");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter mobile number");
      long l=sc.nextLong();
      String num=String.valueOf(l);
      try{
      validate(num);
      }
      catch(InvalidMobileNumberException e)
        {
          System.out.println("exception handled in main");
          e.printStackTrace();
        }
      System.out.println("Exception handled");
    }
  }