class Student1
  {
    String sname;
    int rno;
    public void insertRecord(String name,int rollno)
    {
      sname=name;
      rno=rollno;
    }
    public void display()
    {
      System.out.println(sname+" "+rno);
    }
    public static void main(String args[])
    {
      Student1 st=new Student1();
      Student1 st1=new Student1();
      st.insertRecord("radha",101);
      st.display();
      st1.insertRecord("kumar",102);
      st1.display();
    }
  }