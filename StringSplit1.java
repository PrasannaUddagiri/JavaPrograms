class StringSplit1
  {
    public static void main(String args[])
    {
    String s1="welcometobitlabs";
    String s[]=s1.split("e");
    for(int i=0;i<s.length;i++)
      {
        System.out.println(s[i]);
      }
    }
  }