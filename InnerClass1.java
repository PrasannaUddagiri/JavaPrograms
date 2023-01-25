class InnerClass1
{
  String name="Prasanna";
    int age=23;
    String address="Vijayawada";
    class Inner1
    {
      void display()
      {
         System.out.println("the student details are : \nName : "+name+" \nAge : "+age+" \nAddress : "+address);
        }
    }
    public static void main(String args[])
    {
        InnerClass1 obj=new InnerClass1();
        InnerClass1.Inner1 in=obj.new Inner1();
        in.display();
      }
}
