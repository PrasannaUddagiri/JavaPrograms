//Using setter and getter methods
class Student
  {
    String name;
    int id;
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
  }
class SetGetEx
  {
    public static void main(String args[])
    {
      Student st=new Student();
      st.setName("ram");
      String sname=st.getName();
      System.out.println(sname);
      st.setId(101);
      System.out.println(st.getId());
    }
  }