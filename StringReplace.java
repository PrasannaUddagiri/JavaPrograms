class StringReplace
  {
    public static void main(String args[])
    {
    String s1="welcome to bilabs";
      System.out.println(s1.replace("e","a"));
      System.out.println(s1.replace("come","go"));
      System.out.println(s1.replaceAll(" ",","));
      System.out.println(s1.replace(" ",""));
    }
  }