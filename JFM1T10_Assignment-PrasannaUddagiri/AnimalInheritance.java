/*   JFM1T10_Assignment2:

     Create a class Animal that has a method makeSound(). 
     Then create two subclasses of Animal class: Horse and Cat that extends Animal class and 
     provide their specific implementation of makeSound() method.

     Sample Output:
     The animal makes a sound
     The Horse says: wee wee
     The Cat says: meow meow

*/
class Animal
  {
    void makeSound()
    {
      System.out.println("the animal makes a sound");
    }
  }
class Horse extends Animal
{
  void makeSound()
  {
    System.out.println("the horse says : wee wee");
  }
}
class Cat extends Animal
{
  void makeSound()
  {
    System.out.println("the cat says : meow meow");
  }
}
class AnimalInheritance
  {
    public static void main(String args[])
    {
      Animal obj=new Animal();
      obj.makeSound();
      Horse h=new Horse();
      h.makeSound();
      Cat c=new Cat();
      c.makeSound();
    }
  }

//Add Animal class and Create Sound() method 

//Add Horse class that extends Animal class

//Add Cat class that extends Animal class

//class  AnimalInheritance {
 
//Add main method here

//Create all 3 Animal objects and add to an array 

//Loop over the array and print sound it makes

//}

