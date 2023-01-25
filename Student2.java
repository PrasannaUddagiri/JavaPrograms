class Student
  {
    String sname;
    int rollno;
    String address;
   
    public static void main(String args[])
    {
      Student st=new Student();
      Student st1=new Student();
      st.sname="sitha";
      st.rollno=456;
      st.address="hyd";
      st1.sname="rama";
      st1.rollno=123;
      st1.address="vij";
      System.out.println(st.sname+" "+st.rollno+" "+st.address);
      System.out.println(st1.sname+" "+st1.rollno+" "+st1.address);
      
    }
  }