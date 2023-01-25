class StringCharString
  {
    public static void main(String args[])
    {
      String s="welcome";
    char ch[]=s.toCharArray();
     for(int i=0;i<ch.length;i++)
       {
         System.out.println(ch[i]);
       }
      char ch1[]={'a','b','c'};
      String s1=new String(ch1);
      System.out.println(s1);
    }
  }