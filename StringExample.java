class StringExample
  {
    public static void main(String args[])
    {
      String s="prasanna";
      String s1="uddagiri";
      String s3="prasanna naidu uddagiri";
      String s4="naga lakshmi prasanna uddagiri";
      int index=s3.indexOf("naidu");
      int index1=s4.lastIndexOf("prasanna");
      String s5[]=s3.split(" ");
      for(int i=0;i<s5.length;i++)
        {
          System.out.println(s5[i]);
        }
      System.out.println("the length of the string is : "+s.length());
      System.out.println(s.compareTo(s1));
      System.out.println(s.concat(s1));
      System.out.println("the index value of first occurance of the character is : "+index);
      System.out.println("the index value of last occurance of the character is : "+index1);
    }
  }