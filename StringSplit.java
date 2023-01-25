class StringSplit
  {
    public static void main(String args[])
    {
    String s1="welcome to bit labs";
    String s[]=s1.split(" ");
    for(int i=0;i<s.length;i++)
      {
        System.out.println(s[i]);
      }
    }
  }