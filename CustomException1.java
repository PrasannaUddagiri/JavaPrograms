import java.util.*;
class InvalidAgeException extends Exception
  {
   public InvalidAgeException(String str)
    {
      super(str);
    }
  }
class CustomException1
  {
    public static void checkAge(int age) throws InvalidAgeException
    {
      if(age<18)
      {
        throw new InvalidAgeException("you are not ellible to vote");
      }
      else
      {
        System.out.println("you are elligible");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int a=sc.nextInt();
      try
        {
      checkAge(a);
      }
      catch(InvalidAgeException e)
        {
          System.out.println(e);
        }
    }