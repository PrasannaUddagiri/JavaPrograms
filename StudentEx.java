//Array of objects
import java.util.*;
class Student
  {
    String sname;
    int rollno;
    String address;
   
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Student st[]=new Student[3];
      for(int i=0;i<3;i++)
        {
          st[i]=new Student();
         System.out.println("enter student name");
          st[i].sname=sc.next();
          System.out.println("enter student rollno");
          st[i].rollno=sc.nextInt();
          System.out.println("enter student address");
          st[i].address=sc.next();
        }
      System.out.println("the student details are");
      for(int i=0;i<3;i++)
        {
          System.out.println(st[i].sname+" "+st[i].rollno+" "+st[i].address);
        }
      
    }
  }