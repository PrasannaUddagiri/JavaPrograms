class Employee1
  {
    String empname;
    int emprno;
    public void insertRecord(String ename,int erollno)
    {
      empname=ename;
      emprno=erollno;
    }
    public void display()
    {
      System.out.println(empname+" "+emprno);
    }
    public static void main(String args[])
    {
      Employee1 emp=new Employee1();
      Employee1 emp1=new Employee1();
      emp.insertRecord("Prasanna",101);
      emp.display();
      emp1.insertRecord("Venkat",102);
      emp1.display();
    }
  }