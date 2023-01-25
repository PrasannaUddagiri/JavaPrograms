//final class
//final
class Animal
  {
    
    void run()
    {
      System.out.println("running ");
    }
  }
class Dog extends Animal
  {
    
    void walk()
    {
      System.out.println("walking");
    
    }
  }
class FinalEx2
  {
    public static void main(String args[])
    {
     Dog dobj=new Dog();
    dobj.run();
    dobj.walk();
  }
  }