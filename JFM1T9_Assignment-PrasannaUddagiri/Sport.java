/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      

class A 
  {
    void x()
    {
      System.out.print("football");
    }
    void y()
    {
      System.out.print("sport name : ");
     this.x();
    }
  }
class Sport
  {
    public static void main(String args[])
    {
    A obj=new A();
    obj.y();
    }
  }
 

// Create a member variable for Sport name 

// Set member variable for Sport name 

//public static void main(String args[]) { 

// Create object for Sport class 

// Print the value of Sport name using "this" reference

 

//} 

//Kindly check the logic
