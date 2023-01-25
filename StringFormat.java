//format()
class StringFormat
  {
    public static void main(String args[])
    {
    String s=String.format("%d",234);
    String s1=String.format("%f",45.67);
    String s2=String.format("%.3f",68.23487);
    String s3=String.format("%c",'r');
    String s4=String.format("%s","prasanna");
      System.out.println(s);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
    }
  }