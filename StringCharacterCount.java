 class StringCharacterCount
  {
    public static void main(String args[])
    {
      String str="Prasanna@123$Naidu12345";
      int acount=0,dcount=0,scount=0;
      for(int i=0;i<str.length();i++)
        {
          if((str.charAt(i)>='a'&& str.charAt(i)<='z') || (str.charAt(i)>='A'&& str.charAt(i)<='Z'))
          {
            acount++;
          }
        
      else if(str.charAt(i)>='0'&& str.charAt(i)<='9')
      {
        dcount++;
      }
      else{
        scount++;
      }
        }
      System.out.println("alphabets count in the give string is :"+acount);
      System.out.println("Digits count in the give string is :"+dcount);
      System.out.println("special characters count in the give string is :"+scount);
   }
    
  }