//Using setter and getter methods
class Employee
  {
    String name;
    int id;
    String address;
    public void setName(String name)
    {
      this.name=name;
    }
   public String getName()
    {
      return name;
    }
    public void setId(int id)
    {
      this.id=id;
    }
    public int getId()
    {
      return id;
    }
    public void setAddress(String address)
    {
      this.address=address;
    }
   public String getAddress()
    {
      return address;
    }
  }
class SetGetEx1
  {
    public static void main(String args[])
    {
      Employee emp=new Employee();
      emp.setName("prasanna");
      String sname=emp.getName();
      System.out.println(sname);
      emp.setId(101);
      System.out.println(emp.getId());
      emp.setAddress("vijayawada");
      System.out.println(emp.getAddress());
    }
  }