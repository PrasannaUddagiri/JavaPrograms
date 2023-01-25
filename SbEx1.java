//capacity()
class SbEx1
  {
    public static void main(String args[])
    {
      StringBuffer sb=new StringBuffer();
      System.out.println(sb.capacity()); //16
      sb.append("hello");
       System.out.println(sb.capacity());
      sb.append("welcome bitlabs");
      System.out.println(sb.capacity());
      sb.ensureCapacity(50);
      System.out.println(sb.capacity());
     }
  }