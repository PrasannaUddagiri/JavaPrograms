//to convert primitive datatype to object
class WrapperClassEx
  {
    public static void main(String args[])
    {
      int a=20;
      Integer i=Integer.valueOf(a); //autoboxing
      System.out.println("the value of i is : "+i);
      Integer j=a;
      System.out.println("the value of j is : "+j);
    }
  }