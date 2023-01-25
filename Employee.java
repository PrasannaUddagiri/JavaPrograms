class Employee
  {
    String empname;
    int emprollno;
    long empsalary;
    String empdesignation;
   
    public static void main(String args[])
    {
      Employee emp=new Employee();
       Employee emp1=new Employee();
       Employee emp2=new Employee();
      emp.empname="Prasanna";
      emp.emprollno=357;
      emp.empsalary=100000;
      emp.empdesignation="Associate Engineer";
      emp1.empname="Venkat";
      emp1.emprollno=359;
      emp1.empsalary=125000;
      emp1.empdesignation="Technician";
      emp2.empname="Prasanth";
      emp2.emprollno=159;
      emp2.empsalary=150000;
      emp2.empdesignation="Manager";
      System.out.println(emp.empname+" "+emp.emprollno+" "+emp.empsalary+" "+emp.empdesignation);
      System.out.println(emp1.empname+" "+emp1.emprollno+" "+emp1.empsalary+" "+emp1.empdesignation);
      System.out.println(emp2.empname+" "+emp2.emprollno+" "+emp2.empsalary+" "+emp2.empdesignation);
      
      
    }
  }