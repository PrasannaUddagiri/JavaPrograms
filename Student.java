class Person 
  {
   String name;
    int age;
    void eat()
    {
      System.out.println("eating");
    }
    void walk()
    {
      System.out.println("walking");
    }
  }
class Student extends Person  
  {
   int rollno;
    void study()
    {
      System.out.println("studying");
    }
    public static void main(String args[])
    {
      public void display()
        {
        System.out.println(name+ " "+age+" "+rollno);
        }
     Student obj=new Student();
      obj.name="prasanna";
      obj.age=23;
      obj.rollno=12345;
      obj.eat();
      obj.walk();
      obj.study();
      obj.display();
    }

    
    
    
  }








/*import java.util.*;
class Person
  {
    void name()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the name");
      String n=ntr.nextLine();
      System.out.println(n);
    }
    void age()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the age");
      int a=ntr.nextInt();
      System.out.println(a);
    }
    void eat()
    {
      System.out.println("eating");
    }
    void walk()
    {
      System.out.println("walkiing");
    }
  }
class Student extends Person
  {
    void roll()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the Rool no.");
      int b=ntr.nextInt();
      System.out.println(b);
    }
    void study()
    {
      System.out.println("Student will Study now");
    }
    void standard()
    {
      Scanner ntr=new Scanner(System.in);
      System.out.println("Enter the level of the class");
      int c=ntr.nextInt();
      System.out.println(c);
    }
    public static void main(String[]args)
    {
      Student obj=new Student();
      obj.name();
      obj.age();
      obj.roll();
      obj.standard();
      obj.study();
      obj.eat();
      obj.walk();
    }
  }*/








/*class person  //person is a parent class
  {
   String name;
    int age;
  }
class Student extends person  //Student is child class
  {
    int rollno;
    public void display()
    {
      System.out.println(name+"  "+age+"  "+rollno);
    }
    public static void main(String args[])
    {
      Student obj=new Student();
      obj.name="Anitha";
      obj.rollno=102;
      obj.age=24;
      obj.display();  
    }
  }*/