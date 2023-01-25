class StringBufferEx
  {
    public static void main(String args[])
    {
      StringBuffer sb=new StringBuffer("welcome");
       System.out.println(sb);
      StringBuffer sb1=new StringBuffer("welcome");
      sb1.append("bitlabs");
      System.out.println(sb1);
      StringBuffer sb2=new StringBuffer("welcome");
      sb2.reverse();
       System.out.println(sb2);
       StringBuffer sb3=new StringBuffer("welcome");
      sb3.insert(3,"hello");
      System.out.println(sb3);
      StringBuffer sb4=new StringBuffer("welcome");
      sb4.delete(2,5);
      System.out.println(sb4);
      StringBuffer sb5=new StringBuffer("welcome");
       sb5.replace(2,5,"be");
      System.out.println(sb5);
      }
  }