class Parent1
  {
    void display()
    {
      System.out.println("barking");
    }
  }
class Parent2
  {
    void display()
    {
      System.out.println("meow");
    }
  }
class Child extends Parent1,Parent2
  {
    public static void main(String args[])
    {
      Child obj=new Child();
      obj.display();
    }
  }

