//Concat
class StringConcat
  {
    public static void main(String args[])
    {
     String s1="hello";
      String s2="hello";
      String s3="welcome";
      String s4="apple";
      System.out.println(s1.concat(s2)); //0
      System.out.println(s1.concat(s3).concat(s2).concat(s4)); //-15
      System.out.println(s1.concat(s4)); //7 
      
    }
  }