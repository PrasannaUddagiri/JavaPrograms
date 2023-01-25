class StringAlphabetCount
  {
    public static void main(String args[])
    {
      String str="nagalakshmiprasannanaiduuddagiri";
      int vcount=0,bcount=0;
      for(int i=0;i<str.length();i++)
        {
          if((str.charAt(i)=='a')||(str.charAt(i)=='e')|| 
           (str.charAt(i)=='i')||(str.charAt(i)=='o')|| 
            (str.charAt(i)=='u')||(str.charAt(i)=='A')|| 
           (str.charAt(i)=='E')||(str.charAt(i)=='I')|| 
           (str.charAt(i)=='O')||(str.charAt(i)=='U'))
           {
             vcount++;
           }
          else
         {
            bcount++;
          }
        }
      System.out.println("the count of vowels in given string are : "+vcount);
      System.out.println("the count of consonants in given string are : "+bcount);
    }
  }