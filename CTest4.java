//create a string divide the words and reverse the words
class CTest4
  {
    public void display()
    {
      String str="welcome to bitlabs";
      String s[]=str.split(" ");
      for(int i=0;i<s.length;i++)
        {
          System.out.println(s[i]);
        }
    }
    public void reverse()
    {
      String str1="hello bitlabs";
      //StringBuffer sb=new StringBuffer("hello bitlabs");
      String s1="";
      for(int i=str1.length()-1;i>=0;i--)
        //for(int i=0;i<str1.length()-1;i--)
        {
         s1=s1+str1.charAt(i);
        }
     //String str1=int str1.charAt();
      System.out.println("the reverse word is : "+s1);
    }
    public static void main(String args[])
    {
      CTest4 obj=new CTest4();
      obj.display();
      obj.reverse();
    }                     
  }