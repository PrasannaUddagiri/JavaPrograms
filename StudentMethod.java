class Student
{
    String name;
    int rollno;
    public void insert(String name,int rollno)
    {
      this.name=name;
      this.rollno=rollno;
    }
    public void display()
    {
        System.out.println(name+" "+rollno);  
    }
   
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.insert("anitha",101);
        s2.insert("prasanna",102);
        s1.display();
        s2.display();
        
    }
}