//compareTo
class StringCompare
  {
    public static void main(String args[])
    {
     String s1="hello";
      String s2="hello";
      String s3="welcome";
      String s4="apple";
      System.out.println(s1.compareTo(s2)); //0
      System.out.println(s1.compareTo(s3)); //-15
      System.out.println(s1.compareTo(s4)); //7 
      
    }
  }