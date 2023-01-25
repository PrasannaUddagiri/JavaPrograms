class StringDoubleEqual
  {
    public static void main(String args[])
    {
     String s1="hello";
      String s2="hello";
      String s3=new String("hai");
      String s4=new String("hai");
      System.out.println(s1.equals(s2)); 
      System.out.println(s1==s2); 
      System.out.println(s3.equals(s4)); 
      System.out.println(s3==s4);
     }
  }