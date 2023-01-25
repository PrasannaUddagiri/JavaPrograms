class parent
  {
    String name="Venkat";
    int rollno=102;
    public void display()
    {
      System.out.println("hello bitlabs");
    }
  }
class child extends parent
  {
    String name="Prasanna";
    int rollno=103;
    int age=22;
    public void display()
    {
      System.out.println(name);
      System.out.println(rollno);
      System.out.println(age);
      System.out.println(super.name);
      System.out.println(super.rollno);
      super.display();
    }
  }
class SuperEx4
{
  public static void main(String args[])
  {
    child obj=new child();
    obj.display();
  }
}