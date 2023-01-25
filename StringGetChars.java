class StringGetChars
  {
    public static void main(String args[])
    {
     String str="Helo welcome to bitlabs";
char ch[]=new char[7];
str.getChars(5,12,ch,0);
System.out.println(ch);
    }
  }