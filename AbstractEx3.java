abstract class Operation
  {
    abstract public int arithmetic();
  }
class Sum extends Operation
  {
    public int arithmetic()
    {
      int a=34,b=12,c;
      return c=a+b;
    }
  }
class Mul extends Operation
  {
    public int arithmetic()
    {
      int a=12,b=42,c;
      return c=a*b;
     }
  }
class AbstractEx3
  {
    public static void main(String args[])
    {
      Sum su=new Sum();
      Mul mu=new Mul();
      System.out.println("the sum of 2 numbers is : "+su.arithmetic());
      System.out.println("the mul of 2 numbers is : "+mu.arithmetic());
     }
  }
  