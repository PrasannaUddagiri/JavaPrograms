//User defined objects added to list
import java.util.*;
class Student
  {
    int rollno;
    String name;
    String address;
    Student(int rollno,String name,String address)
    {
     this.rollno=rollno;
      this.name=name;
      this.address=address;
    }
  }
   public class ListEx
     {
    public static void main(String args[])
       {
         Student s1=new Student(123,"suhan","vizag");
         Student s2=new Student(234,"sitha","hyd");
         Student s3=new Student(678,"ram","hyd");
         ArrayList<Student> al=new ArrayList<Student>();
         al.add(s1);
         al.add(s2);
         al.add(s3);
         for(Student ob:al)
           {
             System.out.println(ob.rollno+" "+ob.name+" "+ob.address);
           }
         
       }
  }